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

import tn.stage.spring.Iservice.IDepartement;
import tn.stage.spring.Iservice.IMission;
import tn.stage.spring.entity.Departement;
import tn.stage.spring.entity.Mission;

@RestController
@RequestMapping("/departement")
@CrossOrigin
public class DepartementRestController {
	@Autowired
	IDepartement departementService;
	
	// http://localhost:8075/SpringMVC/departement/retrieve-all-departements
			@GetMapping("/retrieve-all-departements")
			@ResponseBody
			public List<Departement> getDepartements() {
				return departementService.retrieveAllDepartement();
			}

			// http://localhost:8075/SpringMVC/departement/retrieve-departement/8
			@GetMapping("/retrieve-departement/{id}")
			@ResponseBody
			public Departement retrieveDepartement(@PathVariable("id") int id) {
			
				return departementService.retrieveDepartement(id);
			}

			// http://localhost:8075/SpringMVC/departement/add-departement
			@PostMapping("/add-departement")
			@ResponseBody
			public Departement addDepartement(@RequestBody Departement d) {
				Departement departement = departementService.addDepartement(d);
				return departement;
			}

			// http://localhost:8075/SpringMVC/departement/remove-departement/{id}
			@DeleteMapping("/remove-departement/{id")
			@ResponseBody
			public void removeDepartement(@PathVariable("id") int id) {
				departementService.deleteDepartement(id);
			}

			// http://localhost:8075/SpringMVC/departement/modify-departement
			@PutMapping("/modify-departement")
			@ResponseBody
			public Departement modifyDepartement(@RequestBody Departement departement) {
				return departementService.updateDepartement(departement);
		}

}
