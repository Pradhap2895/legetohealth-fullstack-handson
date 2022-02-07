package com.legatohealth.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageBean {

	@Value("${user.message}")
	private String message;
	@Value("${user.password}")
	private String password;

	public String getMessage() {
		return message;
	}

	public String getPassword() {
		return password;
	}
}
