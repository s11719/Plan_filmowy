package repositories.impl;

import java.util.List;

import domain.Scena;
import repositories.C_Repozytorium;

public class Temp_Repozytorium_Scen implements C_Repozytorium<Scena>{

	Temp_Baza_Danych bazaDanych;
	
	public Temp_Repozytorium_Scen(Temp_Baza_Danych bazaDanych) {
	
	}

	
	public void save(Scena encja) {
		
		bazaDanych.sceny.add(encja);
	}

	public void update(Scena encja) {
		
	}

	public void delete(Scena encja) {
		bazaDanych.sceny.remove(encja);
		
	}
	
	public Scena get(int id) {
		for(Scena r : bazaDanych.sceny)
			if(r.getId()==id)
				return r;
		return null;
	}
	
	public List<Scena> getAll() {

		return bazaDanych.sceny;
	}

}
