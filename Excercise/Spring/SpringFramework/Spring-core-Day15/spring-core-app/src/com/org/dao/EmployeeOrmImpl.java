package com.org.dao;

import org.springframework.stereotype.Repository;

@Repository

public class EmployeeOrmImpl implements EmployeeDao {

	public EmployeeOrmImpl(){
		System.out.println("--EmployeeOrmImple created--");
	}
	@Override
	public void store() {
		System.out.println("--store() called on EmployeeOrmImpl ");
		
	}

	@Override
	public void delete() {
		System.out.println("--delete() called on EmployeeOrmImpl ");
		
	}

}
