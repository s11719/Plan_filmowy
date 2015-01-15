import domain.*;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("To będzie repozytorium planu filmowego.");
	
	Osoba Piotrek = new Osoba();
	Pracownik Reżyser = new Pracownik();
	Lokacja Gdynia = new Lokacja();
	Scena Pierwsza = new Scena();
	
	Reżyser.setFunkcja("Reżyser");
	Gdynia.setNazwa_lokacji("Gdynia");
	Pierwsza.setNumer_sceny("1");
	
	Piotrek.setImię("Piotrek");
	Piotrek.setNazwisko("Ptaszyński");
	Piotrek.setData_urodzenia("1986-07-31");
	Piotrek.setPracownik(Reżyser);
	
	
	
	
	
	}
	
}
