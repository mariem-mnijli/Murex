package tn.stage.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.stage.spring.Iservice.Iclient;
import tn.stage.spring.entity.Client;
import tn.stage.spring.repository.ClientRepository;

@Service 
@Slf4j
public class ClientService implements Iclient{
	@Autowired
	ClientRepository clientRepository;

	@Override
	public List<Client> retrieveAllClient() {
		return (List<Client>) clientRepository.findAll();
	}

	@Override
	public Client addClient(Client c) {
		log.info("In method addClient");
		return clientRepository.save(c);
	}

	@Override
	public void deleteClient(int id) {
		log.info("In method deleteClient");
		clientRepository.deleteById(id);
		
	}

	@Override
	public Client updateClient(Client c) {
		log.info("In method updateClient");
		return clientRepository.save(c);
	}

	@Override
	public Client retrieveClient(int id) {
		Client client = clientRepository.findById(id).orElse(null);
		return client;
	}

}
