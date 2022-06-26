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

import tn.stage.spring.Iservice.IMission;
import tn.stage.spring.entity.Mission;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/mission")
public class MissionRestController {
	@Autowired
	IMission missionService;
	
	// http://localhost:8075/SpringMVC/mission/retrieve-all-missions
		@GetMapping("/retrieve-all-missions")
		@ResponseBody
		public List<Mission> getMissions() {
			return missionService.retrieveAllMission();
		}

		// http://localhost:8075/SpringMVC/mission/retrieve-mission/8
		@GetMapping("/retrieve-mission/{mission-num}")
		@ResponseBody
		public Mission retrieveMission(@PathVariable("mission-num") int NumMission) {
		
			return missionService.retrieveMission(NumMission);
		}

		// http://localhost:8075/SpringMVC/mission/add-mission
		@PostMapping("/add-mission")
		@ResponseBody
		public Mission addMission(@RequestBody Mission t) {
			Mission mission = missionService.addMission(t);
			return mission;
		}

		// http://localhost:8075/SpringMVC/mission/remove-mission/{mission-num}
		@DeleteMapping("/remove-mission/{mission-num}")
		@ResponseBody
		public void removeMission(@PathVariable("mission-num") int NumMission) {
			missionService.deleteMission(NumMission);
		}

		// http://localhost:8075/SpringMVC/mission/modify-mission
		@PutMapping("/modify-mission")
		@ResponseBody
		public Mission modifyMission(@RequestBody Mission mission) {
			return missionService.updateMission(mission);
	}

}



