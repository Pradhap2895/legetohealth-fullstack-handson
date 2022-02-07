package com.legatohealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.legatohealth.client.FeignClient;
import com.legatohealth.service.MyService;

@RestController
@RequestMapping("/myclient")
public class ServiceClientController {

	@Autowired
	private RestTemplate template;

	@Autowired
	private FeignClient feignClient;

	@Autowired
	private MyService myService;

	@GetMapping("one")
	public ResponseEntity<Object> callFirstApp() {
		String url = "http://FIRSTAPP/myfirstapi/on1";
		String data = template.getForObject(url, String.class);
		return ResponseEntity.status(200).body("Second App Calling " + data);
	}

	@GetMapping("/oneMore")
	public ResponseEntity<Object> callFirstApAgain() {
		String data = feignClient.invokeFirstApp();
		return ResponseEntity.status(200).body("Second App Calling again=>" + data);
	}

	@GetMapping("/circuitRequest")
	public ResponseEntity<Object> callFirstAppWithCircuitBreaker() {
		String data = myService.getFirstAppData();
		return ResponseEntity.status(200).body("response from circuit breaker=>" + data);
	}
}
