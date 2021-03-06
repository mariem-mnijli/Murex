package tn.stage.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.stage.spring.Iservice.IMission;
import tn.stage.spring.entity.Mission;
import tn.stage.spring.repository.MissionRepository;



@Service 
@Slf4j
public class MissionService implements IMission {
	@Autowired
	 MissionRepository missionRepository;

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

}


