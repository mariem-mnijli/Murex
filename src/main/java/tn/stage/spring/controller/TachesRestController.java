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

import tn.stage.spring.Iservice.ITaches;
import tn.stage.spring.entity.Taches;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/taches")
public class TachesRestController {
	@Autowired
	ITaches tacheService;
	
	// http://localhost:8075/SpringMVC/tache/retrieve-all-taches
		@GetMapping("/retrieve-all-taches")
		@ResponseBody
		public List<Taches> getTachess() {
			return tacheService.retrieveAllTaches();
		}

		// http://localhost:8075/SpringMVC/tache/retrieve-Taches/{Taches-num}
		@GetMapping("/retrieve-Taches/{Taches-num}")
		@ResponseBody
		public Taches retrieveTaches(@PathVariable("taches-num") int NumTaches) {
		
			return tacheService.retrieveTaches(NumTaches);
		}

		// http://localhost:8075/SpringMVC/taches/add-taches
		@PostMapping("/add-tache")
		@ResponseBody
		public Taches addtaches(@RequestBody Taches t) {
			Taches taches = tacheService.addTaches(t);
			return taches;
		}

		// http://localhost:8075/SpringMVC/tache/remove-tache/{tache-num}
		@DeleteMapping("/remove-tache/{tache-num}")
		@ResponseBody
		public void removeTaches(@PathVariable("Taches-num") int NumTaches) {
			tacheService.deleteTaches(NumTaches);
		}

		// http://localhost:8075/SpringMVC/tache/modify-tache
		@PutMapping("/modify-tache")
		@ResponseBody
		public Taches modifyTaches(@RequestBody Taches taches) {
			return tacheService.updateTaches(taches);
	}

}


