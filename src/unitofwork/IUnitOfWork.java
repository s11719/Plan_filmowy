package unitofwork;

import domain.Encja;

public interface IUnitOfWork {

	public void commit();
	public void rollback();
	public void markAsNew(Encja encja, IUnitOfWorkRepository repository);
	public void markAsDirty(Encja encja, IUnitOfWorkRepository repository);
	public void markAsDeleted(Encja encja, IUnitOfWorkRepository repository);
}
