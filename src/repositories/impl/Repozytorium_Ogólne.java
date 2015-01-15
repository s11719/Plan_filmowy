package repositories.impl;

import java.sql.Connection;

import domain.Osoba;
import domain.Scena;
import repositories.C_Repozytorium;
import repositories.C_Repozytorium_Ogólne;
import repositories.C_Repozytorium_Pracowników;
import unitofwork.IUnitOfWork;

public class Repozytorium_Ogólne implements C_Repozytorium_Ogólne{

	private Connection connection;
	private IUnitOfWork uow;
	
	public Repozytorium_Ogólne(Connection connection, IUnitOfWork uow) {
		super();
		this.connection = connection;
		this.uow = uow;
	}

	public C_Repozytorium_Pracowników getPracownicy() {
		return new Repozytorium_Pracowników(connection, new Tworzymy_Pracownika(), uow);
	}

	public C_Repozytorium<Osoba> getOsoby() {
		return new Repozytorium_Osób(connection, new Tworzymy_Osobę(), uow);
	}

	public C_Repozytorium<Scena> getSceny() {
		return null;
	}

	public void commit() {
		uow.commit();
	}

}
