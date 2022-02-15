package com.legatohealth.app1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("microservice1")
public class App1Controller {
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@GetMapping
	public String m1() {
		LOG.info(" -this is log of app1 inside m1()-");
		return "Hello from first microservice ";
	}

}
