package tn.stage.spring.Iservice;

import java.util.List;

import tn.stage.spring.entity.StatutConsultation;

public interface IstatutConsultation {
	List<StatutConsultation> retrieveAllStatutConsultation();

	StatutConsultation addStatutConsultation (StatutConsultation s);

	void deleteStatutConsultation (int id);

	StatutConsultation updateStatutConsultation (StatutConsultation s);

	StatutConsultation retrieveStatutConsultation (int id);

}
