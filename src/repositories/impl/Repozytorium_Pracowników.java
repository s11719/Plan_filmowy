package repositories.impl;

import java.sql.*;
import java.util.List;

import repositories.C_Repozytorium_Pracowników;
import unitofwork.IUnitOfWork;
import domain.Osoba;
import domain.Scena;
import domain.Pracownik;

public class Repozytorium_Pracowników extends Repozytorium<Pracownik> implements C_Repozytorium_Pracowników{

	public Repozytorium_Pracowników(Connection connection, C_Tworzymy_Encję<Pracownik> tworzymy, IUnitOfWork uow) {
		super(connection,tworzymy, uow);
	}

	@Override
	protected String getTableName() {
		return "pracownicy";
	}

	@Override
	protected String getUpdateQuery() {
		return 
				"UPDATE users SET (funkcja)=(?,?) WHERE id=?";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO users(funkcja)"
				+ "VALUES(?,?)";
	}


	@Override
	protected void setUpInsertQuery(Pracownik encja) throws SQLException {
		
		insert.setString(1, encja.getFunkcja());
		
	}

	@Override
	protected void setUpUpdateQuery(Pracownik encja) throws SQLException {
		update.setString(1, encja.getFunkcja());
		update.setInt(2, encja.getId());
		
		
	}
	
	public List<Pracownik> bierzeUdziałWScenie(Scena scena) {
		return null;
	}

	public List<Pracownik> bierzeUdziałWScenie(String nazwaSceny) {
		return null;
	}

	public List<Pracownik> bierzeUdziałWScenie(int IdSceny) {
		return null;
	}

}
