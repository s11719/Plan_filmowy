package repositories;

import domain.*;

public interface C_Repozytorium_Ogólne {

	public C_Repozytorium_Pracowników getPracownicy();
	public C_Repozytorium<Osoba> getOsoby();
	public C_Repozytorium<Scena> getSceny();
	public void commit();
}
