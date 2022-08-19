package tn.stage.spring.Iservice;

import java.util.List;

import tn.stage.spring.entity.SousTraitant;

public interface ISousTraitant {
	
	List<SousTraitant> retrieveAllSTR();

	SousTraitant addSTR (SousTraitant str);

	void deleteSTR(int id);

	SousTraitant updateSTR (SousTraitant str);

	SousTraitant retrieveSTR(int id);
}
