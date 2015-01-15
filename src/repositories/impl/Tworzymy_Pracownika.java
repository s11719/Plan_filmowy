package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Pracownik;

public class Tworzymy_Pracownika implements C_Tworzymy_Encję<Pracownik> {

	public Pracownik build(ResultSet rs) throws SQLException {
		Pracownik result = new Pracownik();
		result.setId(rs.getInt("id"));
		result.setFunkcja(rs.getString("funkcja"));
		return result;
	}

}
