package repositories.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import repositories.C_Repozytorium_Ogólne;
import unitofwork.IUnitOfWork;
import unitofwork.UnitOfWork;

public class Repozytorium_Ogólne_Zasoby {


	private static String url="jdbc:hsqldb:hsql://localhost/workdb";
	
	public static C_Repozytorium_Ogólne catalog()
	{

		try {
			Connection connection = DriverManager.getConnection(url);
			IUnitOfWork uow = new UnitOfWork(connection);
			C_Repozytorium_Ogólne catalog = new Repozytorium_Ogólne(connection, uow);
		
			return catalog;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
