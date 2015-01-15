package repositories.impl;

import java.util.List;

import domain.Osoba;
import repositories.C_Repozytorium;

public class Temp_Repozytorium_Osób implements C_Repozytorium<Osoba>{

	private Temp_Baza_Danych bazaDanych;
	
	public Temp_Repozytorium_Osób(Temp_Baza_Danych bazaDanych) {
		this.bazaDanych = bazaDanych;
	}

	public void save(Osoba encja) {

		bazaDanych.osoby.add(encja);
		
	}

	public void update(Osoba encja) {
		
	}

	public void delete(Osoba encja) {

		bazaDanych.osoby.remove(encja);
		
	}

	public Osoba get(int id) {

		for(Osoba p: bazaDanych.osoby)
			if(p.getId()==id)
				return p;
		return null;
	}

	public List<Osoba> getAll() {
		return bazaDanych.osoby;
	}

}
