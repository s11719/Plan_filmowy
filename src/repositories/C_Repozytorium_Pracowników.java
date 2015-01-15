package repositories;

import java.util.List;

import domain.*;

public interface C_Repozytorium_Pracowników extends C_Repozytorium<Pracownik>{

	public List<Pracownik> bierzeUdziałWScenie(Scena scena);
	public List<Pracownik> bierzeUdziałWScenie(String nazwaSceny);
	public List<Pracownik> bierzeUdziałWScenie(int IdSceny);
	
}
