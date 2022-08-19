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

import tn.stage.spring.Iservice.IFIClient;
import tn.stage.spring.Iservice.Iclient;
import tn.stage.spring.entity.Client;
import tn.stage.spring.entity.FIClient;

@RestController
@RequestMapping("/FIClient")
@CrossOrigin

public class FIClientRestController {
	@Autowired
	IFIClient clientService;
	
	// http://localhost:8075/SpringMVC/client/retrieve-all-clients
		@GetMapping("/retrieve-all-FIclients")
		@ResponseBody
		public List<FIClient> getFIClients() {
			return clientService.retrieveAllFIClient();
		}

		// http://localhost:8075/SpringMVC/client/retrieve-client/8
		@GetMapping("/retrieve-FIclient/{FIclient-num}")
		@ResponseBody
		public FIClient retrieveFIClient(@PathVariable("FIclient-num") int NumFIClient) {
		
			return clientService.retrieveFIClient(NumFIClient);
		}

		// http://localhost:8075/SpringMVC/client/add-client
		@PostMapping("/add-FIclient")
		@ResponseBody
		public FIClient addFIClient(@RequestBody FIClient c) {
			FIClient client = clientService.addFIClient(c);
			return client;
		}

		// http://localhost:8075/SpringMVC/client/remove-client/{client-num}
		@DeleteMapping("/remove-FIclient/{FIclient-num}")
		@ResponseBody
		public void removeFIClient(@PathVariable("FIclient-num") int NumFIClient) {
			clientService.deleteFIClient(NumFIClient);
		}

		// http://localhost:8075/SpringMVC/client/modify-client
		@PutMapping("/modify-FIclient")
		@ResponseBody
		public FIClient modifyFIClient(@RequestBody FIClient FIclient) {
			return clientService.updateFIClient(FIclient);
	}

}
