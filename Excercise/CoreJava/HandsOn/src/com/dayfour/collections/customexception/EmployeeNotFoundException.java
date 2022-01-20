package com.dayfour.collections.customexception;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception {

	public EmployeeNotFoundException() {
		super("Employee is not found");

	}

	public EmployeeNotFoundException(String error) {

		super(error);
	}

}
