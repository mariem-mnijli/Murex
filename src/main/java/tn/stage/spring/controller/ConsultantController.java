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

import tn.stage.spring.Iservice.IConsultant;
import tn.stage.spring.entity.Consultant;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Consultant")
public class ConsultantController {

	@Autowired
	IConsultant consultantService;
	
	@GetMapping("/retrieve-all-Consultant")
	@ResponseBody
	public List<Consultant> getConsultants() {
		return consultantService.retrieveAllConsultant();
	}

	// http://localhost:8075/SpringMVC/client/retrieve-client/8
	@GetMapping("/retrieve-Consultant/{Consultant-num}")
	@ResponseBody
	public Consultant retrieveClient(@PathVariable("Consultant-num") int NumConsultant) {
	
		return consultantService.retrieveConsultant(NumConsultant);
	}

	// http://localhost:8075/SpringMVC/client/add-client
	@PostMapping("/add-Consultant")
	@ResponseBody
	public Consultant addClient(@RequestBody Consultant c) {
		Consultant client = consultantService.addConsultant(c);
		return client;
	}

	// http://localhost:8075/SpringMVC/client/remove-client/{client-num}
	@DeleteMapping("/remove-Consultant/{numConsultant}")
	@ResponseBody
	public void removeConsultant(@PathVariable("numConsultant") int numConsultant) {
		consultantService.deleteConsultant(numConsultant);
	}

	// http://localhost:8075/SpringMVC/client/modify-client
	@PutMapping("/modify-Consultant")
	@ResponseBody
	public Consultant modifyClient(@RequestBody Consultant c) {
		return consultantService.updateConsultant(c);
}
}
