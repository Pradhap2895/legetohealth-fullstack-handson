package example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import example.beans.Employee;
import example.exceptions.EmployeeNotFoundException;

// performs CRUD operations for Employee 
public class EmployeeDaoImpl implements EmployeeDao {
	// store method to store employee data like name & salary
	public int store(Employee employee) {
		int last_inserted_id = -1;
		int status = -1;
		try {
			// 1st & 2nd step is done by DBUtil.getConnection()
			Connection connection = DBUtil.getConnection();
			// 3rd step is to prepare the statement
			String query = "insert into employee(name, salary) values(?, ?)";
			PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			// update the ? by setting values
			statement.setString(1, employee.getEmpName()); // sets name of employee to 1st ?
			statement.setDouble(2, employee.getEmpSalary()); // sets salary of employee to 2nd ?
			// now the query is ready with values, so you can execute using executeUpdate()
			status = statement.executeUpdate(); // returns number of rows affected
			// closing the resources

			ResultSet rs = statement.getGeneratedKeys();
			if (rs.next()) {
				last_inserted_id = rs.getInt(1);
			}
			statement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return last_inserted_id;
	}

	public Employee findById(int empId) throws EmployeeNotFoundException {
		Employee employee = null;
		try {
			Connection connection = DBUtil.getConnection();
			String query = "select * from employee where id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, empId);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				employee = new Employee(result.getInt(1), result.getString(2), result.getDouble(3));
			}
			result.close();
			statement.close();
			connection.close();
			if (employee == null) {
				// throw checked exception & propagate to caller
				throw new EmployeeNotFoundException("Sorry, " + empId + " not found");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> empList = new ArrayList<Employee>();
		try {
			Connection connection = DBUtil.getConnection();
			String query = "select * from employee ";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(query);
			while (result.next()) {
				Employee employee = new Employee(result.getInt(1), result.getString(2), result.getDouble(3));
				if (employee != null) {
					empList.add(employee);
				}
			}
			result.close();
			statement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public void update(int id, double salary) throws EmployeeNotFoundException {
		try {
			Connection connection = DBUtil.getConnection();
			String query = "update employee set salary = ? where id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setDouble(1, salary);
			statement.setInt(2, id);
			int row = statement.executeUpdate();
			if (row != 0) {
				System.out.println("Employee Salary Updated");
			}
			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteById(int id) throws EmployeeNotFoundException {
		Employee employee = null;
		try {
			Connection connection = DBUtil.getConnection();
			String query = "delete from employee where id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			int row = statement.executeUpdate();
			statement.close();
			connection.close();
			if (row != 0) {
				System.out.println("Employee Data Deleted");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
