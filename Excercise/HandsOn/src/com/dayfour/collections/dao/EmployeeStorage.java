package com.dayfour.collections.dao;

import com.dayfour.collections.customexception.EmployeeNotFoundException;
import com.dayfour.collections.model.Employee;

public interface EmployeeStorage {

	public int save(Employee e);

	public Employee findEmployee(int id) throws EmployeeNotFoundException;

	public Employee[] findEmployees();

	public void delete(int id) throws EmployeeNotFoundException;

}
