package com.database.Project_db.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theatre/show")
public class ShowController {
	
	@GetMapping
	public String getView() {
		return "Theatre getView";
	}
	
	@PostMapping
	public String createShowView() {
		return "Theatre createShowView";
	}
	
	@DeleteMapping
	public String deleteShowView() {
		return "Theatre deleteShowView";
	}
	
	@PatchMapping
	public String updateShowView() {
		return "Theatre updateShowView";
	}
}
