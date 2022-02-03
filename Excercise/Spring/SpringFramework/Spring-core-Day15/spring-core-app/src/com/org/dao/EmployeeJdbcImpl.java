package com.org.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class EmployeeJdbcImpl implements EmployeeDao{

	 public EmployeeJdbcImpl() {
		System.out.println("--EmployeeJdbcImpl created--");
	}
	@Override
	public void store() {
		System.out.println("--store() called on EmployeeJdbcImpl ");
		
	}

	@Override
	public void delete() {
		System.out.println("--delete() called on EmployeeJdbcImpl ");
		
	}

}
