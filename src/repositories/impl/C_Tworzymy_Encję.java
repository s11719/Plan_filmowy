package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Encja;

public interface C_Tworzymy_Encję<C_Encja extends Encja> {

	public C_Encja build(ResultSet rs) throws SQLException;
	
}
