package domain;

import java.util.*;

public class Scena extends Encja {

	private String numer_sceny;
	
	private List<Lokacja> lokacje;
	private List<Pracownik> pracownicy;
	
	public Scena() {
		lokacje = new ArrayList<Lokacja>();
		pracownicy = new ArrayList<Pracownik>();
	}

	public String getNumer_sceny() {
		return numer_sceny;
	}

	public void setNumer_sceny(String numer_sceny) {
		this.numer_sceny = numer_sceny;
	}

	public List<Lokacja> getLokacje() {
		return lokacje;
	}

	public void setLokacje(List<Lokacja> lokacje) {
		this.lokacje = lokacje;
	}

	public List<Pracownik> getPracownicy() {
		return pracownicy;
	}

	public void setPracownicy(List<Pracownik> pracownicy) {
		this.pracownicy = pracownicy;
	}
	
		
}
