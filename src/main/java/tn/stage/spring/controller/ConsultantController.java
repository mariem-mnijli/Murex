package tn.stage.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping("/Consultant")
@CrossOrigin//(value = "http://localhost:4200")
public class ConsultantController {

	@Autowired
	IConsultant consultantService;
	
	@GetMapping("/retrieve-all-Consultant")
	//@PreAuthorize("hasAuthority('SUPERADMIN')")

	@ResponseBody
	public List<Consultant> getConsultants() {
		return consultantService.retrieveAllConsultant();
	}

	// http://localhost:8075/SpringMVC/client/retrieve-client/8
	@GetMapping("/retrieve-Consultant/{Consultant-num}")
	//@PreAuthorize("hasAuthority('SUPERADMIN')")

	@ResponseBody
	public Consultant retrieveClient(@PathVariable("Consultant-num") int NumConsultant) {
	
		return consultantService.retrieveConsultant(NumConsultant);
	}

	// http://localhost:8075/SpringMVC/client/add-client
	@PostMapping("/add-Consultant")
	@ResponseBody
	//@PreAuthorize("hasAuthority('SUPERADMIN')")

	public Consultant addClient(@RequestBody Consultant c) {
		Consultant client = consultantService.addConsultant(c);
		return client;
	}

	// http://localhost:8075/SpringMVC/client/remove-client/{client-num}
	@DeleteMapping("/remove-Consultant/{numConsultant}")
	@ResponseBody
	//@PreAuthorize("hasAuthority('SUPERADMIN')")

	public void removeConsultant(@PathVariable("numConsultant") int numConsultant) {
		consultantService.deleteConsultant(numConsultant);
	}

	// http://localhost:8075/SpringMVC/client/modify-client
	@PutMapping("/modify-Consultant")
	@ResponseBody
	//@PreAuthorize("hasAuthority('SUPERADMIN')")

	public Consultant modifyClient(@RequestBody Consultant c) {
		return consultantService.updateConsultant(c);
}
}
