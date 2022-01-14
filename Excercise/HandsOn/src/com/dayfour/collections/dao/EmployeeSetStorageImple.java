package com.dayfour.collections.dao;

import java.util.*;

import com.dayfour.collections.customexception.EmployeeNotFoundException;
import com.dayfour.collections.model.Employee;

public class EmployeeSetStorageImple implements EmployeeStorage {

	private Set<Employee> empSet = new HashSet<>();

	@Override
	public int save(Employee e) {

		return empSet.add(e) ? e.getId() : -1;
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		Employee findE = new Employee();
		for (Employee t : empSet) {
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
		Employee[] emplArr = new Employee[empSet.size()];
		Iterator<Employee> it = empSet.iterator();
		int i = 0;
		while (it.hasNext()) {
			emplArr[i] = it.next();
			i++;
		}

		return emplArr;
	}

	@Override
	public void delete(int id) throws EmployeeNotFoundException {
		Employee findE = new Employee();
		for (Employee t : empSet) {
			if (t.getId() == id) {
				findE = t;
				break;
			}
		}

		if (findE.getId() == 0) {
			throw new EmployeeNotFoundException("Employee " + id + " is not found..! So, Delete operation failed");
		} else {
			empSet.remove(findE);
			System.out.println("Employee " + id + " deleted");
		}
	}

}
