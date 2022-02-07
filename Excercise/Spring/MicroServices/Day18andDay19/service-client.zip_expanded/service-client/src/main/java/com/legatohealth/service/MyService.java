package com.legatohealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.legatohealth.client.FeignClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class MyService {

	@Autowired
	private FeignClient feignClient;

	@CircuitBreaker(name = "fetchFirstApp", fallbackMethod = "getFirstAppDataAlternate")
	public String getFirstAppData() {
		System.out.println("-Resuqest is going to first app");
		return feignClient.invokeFirstApp();
	}

	public String getFirstAppDataAlternate(Throwable t) {
		System.out.println("-Resuqest is not going to first app");
		return "alternate fallback method is called";
	}
}
