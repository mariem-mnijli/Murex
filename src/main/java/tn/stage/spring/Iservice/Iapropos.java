package tn.stage.spring.Iservice;

import java.util.List;

import tn.stage.spring.entity.Apropos;

public interface Iapropos {
	List<Apropos> retrieveAllApropos();

	Apropos addApropos (Apropos a);

	void deleteApropos (int id);

	Apropos updateApropos (Apropos a);
}
