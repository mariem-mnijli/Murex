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

import tn.stage.spring.Iservice.ISousTraitant;
import tn.stage.spring.entity.SousTraitant;



@RestController
@RequestMapping("/SousTraitant")
@CrossOrigin

public class SousTraitantController {

	@Autowired
	ISousTraitant sousTraitantService;
	
	@GetMapping("/retrieve-all-STR")
	@ResponseBody
	public List<SousTraitant> getSousTraitants() {
		return sousTraitantService.retrieveAllSTR();
	}

	// http://localhost:8075/SpringMVC/client/retrieve-client/8
	@GetMapping("/retrieve-STR/{numsousTraitant}")
	@ResponseBody
	public SousTraitant retrieveSousTraitant(@PathVariable("numsousTraitant") int numsousTraitant) {
	
		return sousTraitantService.retrieveSTR(numsousTraitant);
	}

	// http://localhost:8075/SpringMVC/client/add-client
	@PostMapping("/add-STR")
	@ResponseBody
	public SousTraitant addClient(@RequestBody SousTraitant st) {
		return  sousTraitantService.addSTR(st);
	}

	// http://localhost:8075/SpringMVC/client/remove-client/{client-num}
	@DeleteMapping("/remove-STR/{numsoustraitant}")
	@ResponseBody
	public void removeConsultant(@PathVariable("numsoustraitant") int numsoustraitant) {
		sousTraitantService.deleteSTR(numsoustraitant);
	}

	// http://localhost:8075/SpringMVC/client/modify-client
	@PutMapping("/modify-STR")
	@ResponseBody
	public SousTraitant modifyClient(@RequestBody SousTraitant c) {
		return sousTraitantService.updateSTR(c);
}
}
