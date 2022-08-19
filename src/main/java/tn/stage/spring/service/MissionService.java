package tn.stage.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.stage.spring.Iservice.IMission;
import tn.stage.spring.entity.Departement;
import tn.stage.spring.entity.Mission;
import tn.stage.spring.repository.DepartementRepository;
import tn.stage.spring.repository.MissionRepository;
import tn.stage.spring.repository.TachesRepository;



@Service 
@Slf4j
public class MissionService implements IMission {
	@Autowired
	 MissionRepository missionRepository;
	@Autowired
	DepartementRepository departementRepository;

	@Override
	public List<Mission> retrieveAllMission() {
		return (List<Mission>) missionRepository.findAll();
	}

	@Override
	public Mission addMission(Mission m) {
		log.info("In method addMission");
		return missionRepository.save(m);
	}

	@Override
	public void deleteMission(int id) {
		log.info("In method deleteMission");
		missionRepository.deleteById(id);
		
	}

	@Override
	public Mission updateMission(Mission m) {
		log.info("In method updateMission");
		return missionRepository.save(m);
	}

	@Override
	public Mission retrieveMission(int id) {
		Mission Mission = missionRepository.findById(id).orElse(null);
		return Mission;
	}

	@Override
	public Mission ajouterEtAffecterMissionADepartement(Mission mission, Integer IDF_Departement) {
		Departement d = departementRepository.findById(IDF_Departement).orElse(null);
		mission.setDepartements(d);
		departementRepository.save(d);
		return missionRepository.save(mission);
	}


	
}



