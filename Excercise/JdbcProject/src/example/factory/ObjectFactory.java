package example.factory;

import example.dao.EmployeeDao;
import example.dao.EmployeeDaoImpl;

public class ObjectFactory {
	public static EmployeeDao getInstance() {
		return new EmployeeDaoImpl();
	}
}
