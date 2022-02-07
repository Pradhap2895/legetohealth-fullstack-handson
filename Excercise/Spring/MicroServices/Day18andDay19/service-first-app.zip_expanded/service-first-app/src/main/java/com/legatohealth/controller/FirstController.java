package com.legatohealth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myfirstapi")
public class FirstController {
	@GetMapping("/on1")
	public ResponseEntity<Object> greting() {
		System.out.println("-----------Greetings---------");
		return ResponseEntity.status(200).body("Hello First App");
	}

}
