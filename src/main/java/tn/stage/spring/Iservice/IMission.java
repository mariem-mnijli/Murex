package tn.stage.spring.Iservice;

import java.util.List;

import tn.stage.spring.entity.Mission;
import tn.stage.spring.entity.Taches;

public interface IMission {
	
	List<Mission> retrieveAllMission();

	Mission addMission (Mission m);

	void deleteMission (int id);

	Mission updateMission (Mission m);

	Mission retrieveMission (int id);
	
	public Mission ajouterEtAffecterMissionADepartement (Mission mission,Integer IDF_Departement);
	

}
