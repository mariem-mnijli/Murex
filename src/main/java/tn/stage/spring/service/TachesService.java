package tn.stage.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.stage.spring.Iservice.ITaches;
import tn.stage.spring.entity.Taches;
import tn.stage.spring.repository.TachesRepository;


@Service 
@Slf4j
public class TachesService implements ITaches{

	@Autowired
	TachesRepository tachesRepository;

	@Override
	public List<Taches> retrieveAllTaches() {
		return (List<Taches>) tachesRepository.findAll();
	}

	@Override
	public Taches addTaches(Taches t) {
		log.info("In method addTaches");
		return tachesRepository.save(t);
	}

	@Override
	public void deleteTaches(int id) {
		log.info("In method deleteTaches");
		tachesRepository.deleteById(id);
		
	}

	@Override
	public Taches updateTaches(Taches t) {
		log.info("In method updateTaches");
		return tachesRepository.save(t);
	}

	@Override
	public Taches retrieveTaches(int id) {
		Taches Taches = tachesRepository.findById(id).orElse(null);
		return Taches;
	}

}

