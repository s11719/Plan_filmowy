package repositories.impl;

import java.util.ArrayList;
import java.util.List;

import domain.Pracownik;
import domain.Scena;
import repositories.C_Repozytorium_Pracowników;

public class Temp_Repozytorium_Pracowników implements C_Repozytorium_Pracowników{

	private Temp_Baza_Danych bazaDanych;
	
	public Temp_Repozytorium_Pracowników(Temp_Baza_Danych bazaDanych) {
		this.bazaDanych = bazaDanych;
	}

	public void save(Pracownik encja) {

		bazaDanych.pracownicy.add(encja);
		
	}

	public void update(Pracownik encja) {
		
	}
	
	public void delete(Pracownik encja) {

		bazaDanych.osoby.remove(encja);
		
	}
	
	public Pracownik get(int id) {

		for(Pracownik a: bazaDanych.pracownicy)
			if(a.getId()==id)
				return a;
		return null;
	}
	
	public List<Pracownik> getAll() {
		return bazaDanych.pracownicy;
	}
	
	public List<Pracownik> bierzeUdziałWScenie(Scena scena) {
		return bierzeUdziałWScenie(scena.getId());
	}

	public List<Pracownik> bierzeUdziałWScenie(String nazwaSceny) {

		for(Scena r:bazaDanych.sceny)
			if(r.getNumer_sceny().equals(nazwaSceny))
				return r.getPracownicy();
		return new ArrayList<Pracownik>();
	}

	public List<Pracownik> bierzeUdziałWScenie(int IdSceny) {

		for(Scena r:bazaDanych.sceny)
			if(r.getId()==IdSceny)
				return r.getPracownicy();
		return new ArrayList<Pracownik>();
	}

}
