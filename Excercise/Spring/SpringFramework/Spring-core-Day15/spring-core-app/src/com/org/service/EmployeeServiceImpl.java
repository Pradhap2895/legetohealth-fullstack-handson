package com.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.org.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl {

	private EmployeeDao dao;

	@Autowired
	
	public EmployeeServiceImpl(@Qualifier(value="employeeOrmImpl")EmployeeDao dao) {
		System.out.println("---EmployeeServiceImpl created--");
		this.dao = dao;
	}

	/*
	 * public void setDao(EmployeeDao dao) { this.dao=dao; }
	 */

	public void save() {
		System.out.println("--store() called on EmployeeServiceImpl ");
		dao.store();
	}

	public void remove() {
		System.out.println("--Delete() called on EmployeeServiceImpl ");
		dao.delete();
	}
}
