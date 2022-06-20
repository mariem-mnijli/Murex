package tn.stage.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.stage.spring.Iservice.IstatutConsultation;
import tn.stage.spring.entity.StatutConsultation;
import tn.stage.spring.repository.StatutConsultationRepository;

@Service 
@Slf4j
public class StatutConsultationService implements IstatutConsultation{
	@Autowired
	StatutConsultationRepository statutConsultationRepository;

	@Override
	public List<StatutConsultation> retrieveAllStatutConsultation() {
		return (List<StatutConsultation>) statutConsultationRepository.findAll();
	}

	@Override
	public StatutConsultation addStatutConsultation(StatutConsultation s) {
		log.info("In method addStatut");
		return statutConsultationRepository.save(s);
	}

	@Override
	public void deleteStatutConsultation(int id) {
		log.info("In method deleteStatut");
		statutConsultationRepository.deleteById(id);
		
	}

	@Override
	public StatutConsultation updateStatutConsultation(StatutConsultation s) {
		log.info("In method updateStatut");
		return statutConsultationRepository.save(s);
	}

	@Override
	public StatutConsultation retrieveStatutConsultation(int id) {
		StatutConsultation statutConsultation = statutConsultationRepository.findById(id).orElse(null);
		return statutConsultation;
	}
	

}
