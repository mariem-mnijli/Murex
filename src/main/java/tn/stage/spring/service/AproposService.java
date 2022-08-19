package tn.stage.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.stage.spring.Iservice.Iapropos;
import tn.stage.spring.entity.Apropos;
import tn.stage.spring.repository.AproposRepository;

@Service 
@Slf4j
public class AproposService implements Iapropos{
	@Autowired
	AproposRepository aproposRepository;

	@Override
	public List<Apropos> retrieveAllApropos() {
		return (List<Apropos>) aproposRepository.findAll();
	}

	@Override
	public Apropos addApropos(Apropos a) {
		log.info("In method addApropos");
		return aproposRepository.save(a);
	}

	@Override
	public void deleteApropos(int id) {
		log.info("In method deleteApropos");
		aproposRepository.deleteById(id);
		
	}

	@Override
	public Apropos updateApropos(Apropos a) {
		log.info("In method updateApropos");
		return aproposRepository.save(a);
	}

}
