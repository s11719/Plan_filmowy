package unitofwork;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import domain.Encja;
import domain.StanEncji;

public class UnitOfWork implements IUnitOfWork{

	
	private Connection connection;
	
	private Map<Encja, IUnitOfWorkRepository> encje = 
			new LinkedHashMap<Encja, IUnitOfWorkRepository>();
	
	public UnitOfWork(Connection connection) {
		super();
		this.connection = connection;
		
		try {
			connection.setAutoCommit(false);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void commit() {

		for(Encja encja: encje.keySet())
		{
			switch(encja.getStan())
			{
			case Zmieniony:
				encje.get(encja).persistUpdate(encja);
				break;
			case Usunięty:
				encje.get(encja).persistDelete(encja);
				break;
			case Nowy:
				encje.get(encja).persistAdd(encja);
				break;
			case Nie_zmieniony:
				break;
			default:
				break;}
		}
		
		try {
			connection.commit();
			encje.clear();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void rollback() {

		encje.clear();
		
	}

	public void markAsNew(Encja encja, IUnitOfWorkRepository repository) {
		encja.setStan(StanEncji.Nowy);
		encje.put(encja, repository);
		
	}

	public void markAsDirty(Encja encja, IUnitOfWorkRepository repository) {
		encja.setStan(StanEncji.Zmieniony);
		encje.put(encja, repository);
		
	}

	public void markAsDeleted(Encja encja, IUnitOfWorkRepository repository) {
		encja.setStan(StanEncji.Usunięty);
		encje.put(encja, repository);
		
	}

}
