package com.legatohealth.client;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient("FIRSTAPP/myfirstapi")
public interface FeignClient {

	@GetMapping("/on1")
	public String invokeFirstApp();

}
