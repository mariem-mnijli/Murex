package tn.stage.spring.Iservice;

import java.util.List;

import tn.stage.spring.entity.Client;

public interface Iclient {
	List<Client> retrieveAllClient();

	Client addClient (Client c);

	void deleteClient (int id);

	Client updateClient (Client c);

	Client retrieveClient (int id);
}
