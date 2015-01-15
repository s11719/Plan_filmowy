package repositories.impl;

import domain.Osoba;
import domain.Scena;
import repositories.C_Repozytorium;
import repositories.C_Repozytorium_Ogólne;
import repositories.C_Repozytorium_Pracowników;

public class Temp_Repozytorium_Ogólne implements C_Repozytorium_Ogólne{

	private Temp_Baza_Danych bazaDanych = new Temp_Baza_Danych();
	
	public C_Repozytorium_Pracowników getPracownicy() {
		return new Temp_Repozytorium_Pracowników(bazaDanych);
	}

	public C_Repozytorium<Osoba> getOsoby() {
		return new Temp_Repozytorium_Osób(bazaDanych);
	}

	public C_Repozytorium<Scena> getSceny() {
		return new Temp_Repozytorium_Scen(bazaDanych);
	}

	public void commit() {
		
	}

}
