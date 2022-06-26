package tn.stage.spring.Iservice;

import java.util.List;

import tn.stage.spring.entity.Mission;

public interface IMission {
	
	List<Mission> retrieveAllMission();

	Mission addMission (Mission m);

	void deleteMission (int id);

	Mission updateMission (Mission m);

	Mission retrieveMission (int id);

}
