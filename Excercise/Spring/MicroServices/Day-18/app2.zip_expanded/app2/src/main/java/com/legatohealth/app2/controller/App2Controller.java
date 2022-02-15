package com.legatohealth.app2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("microservice2")
public class App2Controller {
	@Autowired
	private RestTemplate restTemplate;
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@GetMapping
	public String m2() {
		LOG.info(" -this is log of app2 inside m2()-");
		String response = restTemplate.getForObject("http://APP1/microservice1", String.class);
		return "microservice2=>" + response;
	}

}
