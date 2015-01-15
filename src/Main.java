import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import repositories.C_Repozytorium_Ogólne;
import repositories.impl.Repozytorium_Ogólne;
import unitofwork.IUnitOfWork;
import unitofwork.UnitOfWork;
import domain.*;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("To będzie repozytorium planu filmowego.");
	
/*
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
*/
		
	String url="jdbc:hsqldb:mem:test"+","+"SA"+"";
	Pracownik pptaszynski = new Pracownik();
	pptaszynski.setFunkcja("Reżyser");
	
	try {
		
		Connection connection = DriverManager.getConnection(url);
		IUnitOfWork uow = new UnitOfWork(connection);
		
		C_Repozytorium_Ogólne catalog = new Repozytorium_Ogólne(connection, uow);
		
		
		catalog.getPracownicy().save(pptaszynski);
		
		List<Pracownik> usersFromDb= catalog.getPracownicy().getAll();
		
		for(Pracownik userFromDb: usersFromDb)
			System.out.println(userFromDb.getId()+" "+userFromDb.getFunkcja());
						
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	System.out.println("To tyle :)");
}
	
	
	
	}
	
