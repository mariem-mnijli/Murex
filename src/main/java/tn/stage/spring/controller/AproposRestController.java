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

import tn.stage.spring.Iservice.Iapropos;
import tn.stage.spring.entity.Apropos;

@RestController
@RequestMapping("/apropos")
@CrossOrigin
public class AproposRestController {
	@Autowired
	Iapropos aproposService;

	

	// http://localhost:8075/SpringMVC/apropos/retrieve-all-apropos
		@GetMapping("/retrieve-all-apropos")
		@ResponseBody
		public List<Apropos> getApropos() {
			return aproposService.retrieveAllApropos();
		}


		// http://localhost:8075/SpringMVC/apropos/add-apropos
		@PostMapping("/add-apropos")
		@ResponseBody
		public Apropos addApropos(@RequestBody Apropos a) {
			Apropos apropos = aproposService.addApropos(a);
			return apropos;
		}

		// http://localhost:8075/SpringMVC/apropos/remove-apropos/{id}
		@DeleteMapping("/remove-apropos/{id}")
		@ResponseBody
		public void removeApropos(@PathVariable("id") int id) {
			aproposService.deleteApropos(id);
		}

		// http://localhost:8075/SpringMVC/apropos/modify-apropos
		@PutMapping("/modify-apropos")
		@ResponseBody
		public Apropos modifyApropos(@RequestBody Apropos apropos) {
			return aproposService.updateApropos(apropos);
	}

}
