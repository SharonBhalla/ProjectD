package com.database.Project_db.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theatre/offer")
public class OfferController {
	
	@GetMapping
	public String getOfferView() {
		return "getOfferView View";
	}
	
	@PostMapping
	public String createOfferView() {
		return "createOfferView View";
	}
	
	@PatchMapping
	public String updateOfferView() {
		return "updateOfferView View";
	}
}
