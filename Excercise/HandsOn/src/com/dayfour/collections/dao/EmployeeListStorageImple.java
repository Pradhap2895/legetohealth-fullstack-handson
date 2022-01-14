package com.dayfour.collections.dao;

import java.util.ArrayList;
import java.util.List;

import com.dayfour.collections.customexception.EmployeeNotFoundException;
import com.dayfour.collections.model.Employee;

public class EmployeeListStorageImple implements EmployeeStorage {

	private List<Employee> empList = new ArrayList<>();

	@Override
	public int save(Employee e) {

		return empList.add(e) ? e.getId() : -1;
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		Employee findE = new Employee();
		for (Employee t : empList) {
			if (t.getId() == id) {
				findE = t;
				break;
			}
		}

		if (findE.getId() == 0) {
			throw new EmployeeNotFoundException("Employee " + id + " is not found..!");
		}

		return findE;
	}

	@Override
	public Employee[] findEmployees() {
		Employee[] emplArr = new Employee[empList.size()];
		for (int i = 0; i < empList.size(); i++) {
			emplArr[i] = empList.get(i);
		}

		return emplArr;
	}

	@Override
	public void delete(int id) throws EmployeeNotFoundException {
		Employee findE = new Employee();
		for (Employee t : empList) {
			if (t.getId() == id) {
				findE = t;
				break;
			}
		}

		if (findE.getId() == 0) {
			throw new EmployeeNotFoundException("Employee " + id + " is not found..! So, Delete operation failed");
		} else {
			empList.remove(findE);
			System.out.println("Employee " + id + " deleted");
		}
	}

}
