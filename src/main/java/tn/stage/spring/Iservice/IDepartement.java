package tn.stage.spring.Iservice;

import java.util.List;

import tn.stage.spring.entity.Departement;

public interface IDepartement {
	List<Departement> retrieveAllDepartement();

	Departement addDepartement (Departement d);

	void deleteDepartement (int id);

	Departement updateDepartement (Departement d);

	Departement retrieveDepartement (int id);
}
