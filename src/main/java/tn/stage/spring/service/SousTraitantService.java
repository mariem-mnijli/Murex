package tn.stage.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.stage.spring.Iservice.ISousTraitant;
import tn.stage.spring.entity.SousTraitant;
import tn.stage.spring.repository.SousTraitantRepository;

@Service
public class SousTraitantService implements ISousTraitant {
	
	@Autowired
	SousTraitantRepository sousTraitantRepository;

	@Override
	public List<SousTraitant> retrieveAllSTR() {
		return (List<SousTraitant>) sousTraitantRepository.findAll();
	}

	@Override
	public SousTraitant addSTR(SousTraitant str) {

		return sousTraitantRepository.save(str);
	}

	@Override
	public void deleteSTR(int id) {

		sousTraitantRepository.deleteById(id);
	}

	@Override
	public SousTraitant updateSTR(SousTraitant str) {
		return  sousTraitantRepository.save(str);
	}

	@Override
	public SousTraitant retrieveSTR(int id) {
		SousTraitant  str= sousTraitantRepository.findById(id).orElse(null);
		return str;
	}

}
