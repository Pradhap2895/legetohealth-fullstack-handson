package com.org.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.service.EmployeeServiceImpl;

public class TestViewController {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

		//EmployeeServiceImpl empService=(EmployeeServiceImpl)context.getBean("empService");
		EmployeeServiceImpl empService=(EmployeeServiceImpl)context.getBean("employeeServiceImpl");
		
		empService.save();
		ClassPathXmlApplicationContext con=(ClassPathXmlApplicationContext)context;
		con.close();
	}

}
