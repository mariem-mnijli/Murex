package tn.stage.spring.Iservice;

import java.util.List;

import tn.stage.spring.entity.Taches;

public interface ITaches {
	
	List<Taches> retrieveAllTaches();

	Taches addTaches (Taches t);

	void deleteTaches (int id);

	Taches updateTaches (Taches t);

	Taches retrieveTaches (int id);

	public Taches ajouterEtAffecterTacheAMisiion (Taches tache,Integer IDF_Mission);

}
