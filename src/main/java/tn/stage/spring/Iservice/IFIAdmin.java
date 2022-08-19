package tn.stage.spring.Iservice;

import java.util.List;

import tn.stage.spring.entity.FIAdmin;

public interface IFIAdmin {
	List<FIAdmin> retrieveAllFIAdmin();

	FIAdmin addFIAdmin (FIAdmin f);

	void deleteFIAdmin (int id);

	FIAdmin updateFIAdmin (FIAdmin f);

	FIAdmin retrieveFIAdmin (int id);

}
