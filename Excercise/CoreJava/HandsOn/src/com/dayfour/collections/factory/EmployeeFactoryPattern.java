package com.dayfour.collections.factory;

import com.dayfour.collections.dao.EmployeeListStorageImple;
import com.dayfour.collections.dao.EmployeeSetStorageImple;
import com.dayfour.collections.dao.EmployeeStorage;

public class EmployeeFactoryPattern {

	public static EmployeeStorage getInstance(int i) {
		if (i == 2)
			return new EmployeeSetStorageImple();
		else
			return new EmployeeListStorageImple();
	}

}
