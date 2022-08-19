package tn.stage.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.stage.spring.Iservice.IDepartement;
import tn.stage.spring.entity.Departement;
import tn.stage.spring.entity.Mission;
import tn.stage.spring.repository.DepartementRepository;

@Service 
@Slf4j
public class DepartementService implements IDepartement{
	@Autowired
	DepartementRepository departementRepository;

	@Override
	public List<Departement> retrieveAllDepartement() {
		return (List<Departement>) departementRepository.findAll();
	}

	@Override
	public Departement addDepartement(Departement d) {
		log.info("In method addDepartement");
		return departementRepository.save(d);
	}

	@Override
	public void deleteDepartement(int id) {
		log.info("In method deleteDepartement");
		departementRepository.deleteById(id);
		
	}

	@Override
	public Departement updateDepartement(Departement d) {
		log.info("In method updateDepartement");
		return departementRepository.save(d);
	}

	@Override
	public Departement retrieveDepartement(int id) {
		Departement departement = departementRepository.findById(id).orElse(null);
		return departement;
	}
}
