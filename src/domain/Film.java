package domain;

public class Film extends Encja {

	private String tytuł;
	private String gatunek;
	private String wytwórnia;
	private String długość_trwania;
	
	private Osoba osoba;

	public String getTytuł() {
		return tytuł;
	}

	public void setTytuł(String tytuł) {
		this.tytuł = tytuł;
	}

	public String getGatunek() {
		return gatunek;
	}

	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}

	public String getWytwórnia() {
		return wytwórnia;
	}

	public void setWytwórnia(String wytwórnia) {
		this.wytwórnia = wytwórnia;
	}

	public String getDługość_trwania() {
		return długość_trwania;
	}

	public void setDługość_trwania(String długość_trwania) {
		this.długość_trwania = długość_trwania;
	}

	public Osoba getOsoba() {
		return osoba;
	}

	public void setOsoba(Osoba osoba) {
		this.osoba = osoba;
	}
	
		
}
