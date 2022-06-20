package tn.stage.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.stage.spring.Iservice.Iclient;
import tn.stage.spring.entity.Client;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/client")
public class ClientRestController {
	@Autowired
	Iclient clientService;
	
	// http://localhost:8075/SpringMVC/client/retrieve-all-clients
		@GetMapping("/retrieve-all-clients")
		@ResponseBody
		public List<Client> getClients() {
			return clientService.retrieveAllClient();
		}

		// http://localhost:8075/SpringMVC/client/retrieve-client/8
		@GetMapping("/retrieve-client/{client-num}")
		@ResponseBody
		public Client retrieveClient(@PathVariable("client-num") int NumClient) {
		
			return clientService.retrieveClient(NumClient);
		}

		// http://localhost:8075/SpringMVC/client/add-client
		@PostMapping("/add-client")
		@ResponseBody
		public Client addClient(@RequestBody Client c) {
			Client client = clientService.addClient(c);
			return client;
		}

		// http://localhost:8075/SpringMVC/client/remove-client/{client-num}
		@DeleteMapping("/remove-client/{client-num}")
		@ResponseBody
		public void removeClient(@PathVariable("client-num") int NumClient) {
			clientService.deleteClient(NumClient);
		}

		// http://localhost:8075/SpringMVC/client/modify-client
		@PutMapping("/modify-client")
		@ResponseBody
		public Client modifyClient(@RequestBody Client client) {
			return clientService.updateClient(client);
	}

}
