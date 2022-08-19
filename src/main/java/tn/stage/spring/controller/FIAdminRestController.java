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

import tn.stage.spring.Iservice.IFIAdmin;
import tn.stage.spring.entity.Client;
import tn.stage.spring.entity.FIAdmin;

@RestController
@RequestMapping("/fIAdmin")
@CrossOrigin
public class FIAdminRestController {
	@Autowired
	IFIAdmin fIAdminService;
	
	// http://localhost:8075/SpringMVC/fIAdmin/retrieve-all-fIAdmins
			@GetMapping("/retrieve-all-fIAdmins")
			@ResponseBody
			public List<FIAdmin> getFIAdmins() {
				return fIAdminService.retrieveAllFIAdmin();
			}

			// http://localhost:8075/SpringMVC/fIAdmin/retrieve-fIAdmin/8
			@GetMapping("/retrieve-fIAdmin/{id}")
			@ResponseBody
			public FIAdmin retrieveFIAdmin(@PathVariable("id") int id) {
			
				return fIAdminService.retrieveFIAdmin(id);
			}

			// http://localhost:8091/SpringMVC/fIAdmin/add-fIAdmin
			@PostMapping("/add-fIAdmin")
			@ResponseBody
			public FIAdmin addClient(@RequestBody FIAdmin f) {
				FIAdmin fIAdmin = fIAdminService.addFIAdmin(f);
				return fIAdmin;
			}

			// http://localhost:8075/SpringMVC/fIAdmin/remove-fIAdmin/{id}
			@DeleteMapping("/remove-fIAdmin/{id}")
			@ResponseBody
			public void removeFIAdmin(@PathVariable("id") int id) {
				fIAdminService.deleteFIAdmin(id);
			}

			// http://localhost:8075/SpringMVC/fIAdmin/modify-fIAdmin
			@PutMapping("/modify-fIAdmin")
			@ResponseBody
			public FIAdmin modifyFIAdmin(@RequestBody FIAdmin fIAdmin) {
				return fIAdminService.updateFIAdmin(fIAdmin);
		}

}
