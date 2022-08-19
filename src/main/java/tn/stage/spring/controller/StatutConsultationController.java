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

import tn.stage.spring.Iservice.IstatutConsultation;
import tn.stage.spring.entity.StatutConsultation;

@RestController

@RequestMapping("/statutConsultation")
@CrossOrigin

public class StatutConsultationController {
	@Autowired
	IstatutConsultation statutConsultationService;
	
	// http://localhost:8075/SpringMVC/statutConsultation/retrieve-all-statutConsultations
		@GetMapping("/retrieve-all-statutConsultations")
		@ResponseBody
		public List<StatutConsultation> getStatutConsultations() {
			return statutConsultationService.retrieveAllStatutConsultation();
		}

		// http://localhost:8075/SpringMVC/statutConsultation/retrieve-statutConsultation/8
		@GetMapping("/retrieve-statutConsultation/{statutConsultation-id}")
		@ResponseBody
		public StatutConsultation retrieveStatutConsultation(@PathVariable("statutConsultation-id") int IDF_StatutConsultaion) {
		
			return statutConsultationService.retrieveStatutConsultation(IDF_StatutConsultaion);
		}

		// http://localhost:8075/SpringMVC/statutConsultation/add-statutConsultation
		@PostMapping("/add-statutConsultation")
		@ResponseBody
		public StatutConsultation addStatutConsultation(@RequestBody StatutConsultation s) {
			StatutConsultation statutConsultation = statutConsultationService.addStatutConsultation(s);
			return statutConsultation;
		}

		// http://localhost:8075/SpringMVC/statutConsultation/remove-statutConsultation/{statutConsultation-id}
		@DeleteMapping("/remove-statutConsultation/{statutConsultation-id}")
		@ResponseBody
		public void removeStatutConsultation(@PathVariable("statutConsultation-id") int IDF_StatutConsultaion) {
			statutConsultationService.deleteStatutConsultation(IDF_StatutConsultaion);
		}

		// http://localhost:8075/SpringMVC/statutConsultation/modify-statutConsultation
		@PutMapping("/modify-statutConsultation")
		@ResponseBody
		public StatutConsultation modifyStatutConsultation(@RequestBody StatutConsultation statutConsultation) {
			return statutConsultationService.updateStatutConsultation(statutConsultation);
	}


}
