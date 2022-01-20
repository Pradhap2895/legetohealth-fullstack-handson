package com.daythree.exception;

@SuppressWarnings("serial")
public class UserNotFoundException extends Exception {

	public UserNotFoundException() {
		super("User is not found");
	}

	public UserNotFoundException(String error) {
		super(error);
	}
}
