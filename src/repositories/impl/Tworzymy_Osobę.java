package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Osoba;

public class Tworzymy_Osobę implements C_Tworzymy_Encję<Osoba>{

	public Osoba build(ResultSet rs) throws SQLException {
		Osoba osoba = new Osoba();
		osoba.setImię(rs.getString("imię"));
		osoba.setNazwisko(rs.getString("nazwisko"));
		osoba.setData_urodzenia(rs.getString("data_urodzenia"));
		osoba.setId(rs.getInt("id"));
		return osoba;
	}

}
