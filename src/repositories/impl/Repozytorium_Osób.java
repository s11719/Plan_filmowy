package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Osoba;
import repositories.C_Repozytorium;
import unitofwork.IUnitOfWork;

public class Repozytorium_Osób extends Repozytorium<Osoba>{

	protected Repozytorium_Osób(Connection connection,
			C_Tworzymy_Encję<Osoba> tworzymy, IUnitOfWork uow) {
		super(connection, tworzymy, uow);
	}

	protected void setUpUpdateQuery(Osoba encja) throws SQLException {
		update.setString(1, encja.getImię());
		update.setString(2, encja.getNazwisko());
		update.setString(3, encja.getData_urodzenia());
		update.setInt(4, encja.getId());
	}

	protected void setUpInsertQuery(Osoba encja) throws SQLException {
		update.setString(1, encja.getImię());
		update.setString(2, encja.getNazwisko());
		update.setString(3, encja.getData_urodzenia());
	}

	protected String getTableName() {
		return "osoba";
	}

	protected String getUpdateQuery() {
		return "update osoba set (imię,nazwisko,data_urodzenia)=(?,?,?)"
				+ "where id=?";
	}

	protected String getInsertQuery() {
		return "insert into osoba(imię,nazwisko,data_urodzenia) values(?,?,?)";
	}
	
}