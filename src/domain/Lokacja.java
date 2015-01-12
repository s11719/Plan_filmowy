package domain;

import java.util.ArrayList;
import java.util.List;

public class Lokacja extends Encja {

	private String nazwa_lokacji;
	
	private List<Scena> sceny;
	
	public Lokacja() {
		sceny = new ArrayList<Scena>();
	}

	public String getNazwa_lokacji() {
		return nazwa_lokacji;
	}

	public void setNazwa_lokacji(String nazwa_lokacji) {
		this.nazwa_lokacji = nazwa_lokacji;
	}

	public List<Scena> getSceny() {
		return sceny;
	}

	public void setSceny(List<Scena> sceny) {
		this.sceny = sceny;
	}
		
	
}
