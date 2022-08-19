package tn.stage.spring.Iservice;

import java.util.List;

import tn.stage.spring.entity.Consultant;

public interface IConsultant {
	
	List<Consultant> retrieveAllConsultant();

	Consultant addConsultant(Consultant c);

	void deleteConsultant (int id);

	Consultant updateConsultant (Consultant c);

	Consultant retrieveConsultant (int id);

}
