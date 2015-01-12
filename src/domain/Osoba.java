package domain;

import java.util.ArrayList;
import java.util.List;

public class Osoba extends Encja {

	private String imię;
	private String nazwisko;
	private String data_urodzenia;
	
	private Pracownik pracownik;
	
	private List<Film> filmy;
	
	public Osoba() {
		super();
		this.filmy = new ArrayList<Film>();
	}

	public String getImię() {
		return imię;
	}

	public void setImię(String imię) {
		this.imię = imię;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getData_urodzenia() {
		return data_urodzenia;
	}

	public void setData_urodzenia(String data_urodzenia) {
		this.data_urodzenia = data_urodzenia;
	}

	public Pracownik getPracownik() {
		return pracownik;
	}

	public void setPracownik(Pracownik pracownik) {
		this.pracownik = pracownik;
	}

	public List<Film> getFilmy() {
		return filmy;
	}

	public void setFilmy(List<Film> filmy) {
		this.filmy = filmy;
	}	
	
		
}
