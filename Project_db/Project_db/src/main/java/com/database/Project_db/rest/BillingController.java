package com.database.Project_db.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theatre/billing")
public class BillingController {
	
	@GetMapping
	public String getBillingView() {
		return "getBillingView View";
	}
	
	@PostMapping
	public String createBillingView() {
		return "createBillingView View";
	}
	
	@PatchMapping
	public String updateBillingView() {
		return "updateBillingView View";
	}


}
