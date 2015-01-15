package repositories;

import java.util.List;

public interface C_Repozytorium<C_Encja> {

	public void save(C_Encja encja);
	public void update(C_Encja encja);
	public void delete(C_Encja encja);
	public C_Encja get(int id);
	public List<C_Encja> getAll();
	
}
