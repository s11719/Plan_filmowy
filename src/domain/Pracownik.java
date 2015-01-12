package domain;

import java.util.ArrayList;
import java.util.List;

public class Pracownik extends Encja {

	private String funkcja;
	private Osoba osoba;
		
	private List<Scena> sceny;
	
	public Pracownik() {
		sceny = new ArrayList<Scena>();
	}

	public String getFunkcja() {
		return funkcja;
	}

	public void setFunkcja(String funkcja) {
		this.funkcja = funkcja;
	}

	public Osoba getOsoba() {
		return osoba;
	}

	public void setOsoba(Osoba osoba) {
		this.osoba = osoba;
	}

	public List<Scena> getSceny() {
		return sceny;
	}

	public void setSceny(List<Scena> sceny) {
		this.sceny = sceny;
	}
	
		
}
