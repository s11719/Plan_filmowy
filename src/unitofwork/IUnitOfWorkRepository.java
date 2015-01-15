package unitofwork;

import domain.Encja;

public interface IUnitOfWorkRepository {

	public void persistAdd(Encja encja);
	public void persistUpdate(Encja encja);
	public void persistDelete(Encja encja);
}
