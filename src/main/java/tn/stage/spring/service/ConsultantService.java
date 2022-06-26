package tn.stage.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.stage.spring.Iservice.IConsultant;
import tn.stage.spring.entity.Consultant;
import tn.stage.spring.repository.ConsultantRepository;
@Service
public class ConsultantService  implements IConsultant{

	@Autowired
	ConsultantRepository consultantRepository;
	
	@Override
	public List<Consultant> retrieveAllConsultant() {
		return (List<Consultant>) consultantRepository.findAll();
	}

	@Override
	public Consultant addConsultant(Consultant c) {
		return consultantRepository.save(c);
	}

	@Override
	public void deleteConsultant(int id) {
		consultantRepository.deleteById(id);
		
	}

	@Override
	public Consultant updateConsultant(Consultant c) {
		return consultantRepository.save(c);
	}

	@Override
	public Consultant retrieveConsultant(int id) { 
		Consultant c=	consultantRepository.findById(id).orElse(null);
		return c;
	}

}
