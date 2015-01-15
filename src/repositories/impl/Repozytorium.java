package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import repositories.C_Repozytorium;
import unitofwork.IUnitOfWork;
import unitofwork.IUnitOfWorkRepository;
import domain.Encja;

public abstract class Repozytorium<C_Encja extends Encja> implements C_Repozytorium<C_Encja>, IUnitOfWorkRepository
{
	
	protected IUnitOfWork uow;
	protected Connection connection;
	protected PreparedStatement selectByID;
	protected PreparedStatement insert;
	protected PreparedStatement delete;
	protected PreparedStatement update;
	protected PreparedStatement selectAll;
	protected C_Tworzymy_Encję<C_Encja> tworzymy;

	protected String selectByIDSql=
			"SELECT * FROM "
			+ getTableName()
			+ " WHERE id=?";
	protected String deleteSql=
			"DELETE FROM "
			+ getTableName()
			+ " WHERE id=?";
	protected String selectAllSql=
			"SELECT * FROM " + getTableName();
	
	protected Repozytorium(Connection connection,
			C_Tworzymy_Encję<C_Encja> tworzymy, IUnitOfWork uow)
	{
		this.uow=uow;
		this.tworzymy=tworzymy;
		this.connection = connection;
		try {
			selectByID=connection.prepareStatement(selectByIDSql);
			insert = connection.prepareStatement(getInsertQuery());
			delete = connection.prepareStatement(deleteSql);
			update = connection.prepareStatement(getUpdateQuery());
			selectAll = connection.prepareStatement(selectAllSql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void save(C_Encja entity)
	{
		uow.markAsNew(entity, this);
	}

	public void update(C_Encja entity)
	{
		uow.markAsDirty(entity, this);
	}

	public void delete(C_Encja entity)
	{
		uow.markAsDeleted(entity, this);
	}

	public void persistAdd(Encja entity) {

		try {
			setUpInsertQuery((C_Encja)entity);
			insert.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


	public void persistUpdate(Encja entity) {

		try {
			setUpUpdateQuery((C_Encja)entity);
			update.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void persistDelete(Encja encja) {

		try {
			delete.setInt(1, encja.getId());
			delete.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public C_Encja get(int id) {

		try {
			selectByID.setInt(1, id);
			ResultSet rs = selectByID.executeQuery();
			while(rs.next())
			{
				return tworzymy.build(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}



	public List<C_Encja> getAll() {

		List<C_Encja> result = new ArrayList<C_Encja>();
		
		try {
			ResultSet rs= selectAll.executeQuery();
			while(rs.next())
			{
				result.add(tworzymy.build(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	
	protected abstract void setUpUpdateQuery(C_Encja encja) throws SQLException;
	protected abstract void setUpInsertQuery(C_Encja encja) throws SQLException;
	protected abstract String getTableName();
	protected abstract String getUpdateQuery();
	protected abstract String getInsertQuery();
}
