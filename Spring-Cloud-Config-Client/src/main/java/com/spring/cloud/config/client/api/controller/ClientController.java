package com.spring.cloud.config.client.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@Autowired
	ClientConfiguration clientConfiguration;
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return clientConfiguration.getMessage();
	}
}
