package tn.stage.spring.Iservice;

import java.util.List;

import tn.stage.spring.entity.FIClient;

public interface IFIClient {
	List<FIClient> retrieveAllFIClient();

	FIClient addFIClient (FIClient c);

	void deleteFIClient (int id);

	FIClient updateFIClient (FIClient c);

	FIClient retrieveFIClient (int id);
}
