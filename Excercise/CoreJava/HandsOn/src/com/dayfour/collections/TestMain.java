package com.dayfour.collections;

import java.util.Scanner;

import com.dayfour.collections.customexception.EmployeeNotFoundException;
import com.dayfour.collections.dao.EmployeeStorage;
import com.dayfour.collections.factory.EmployeeFactoryPattern;
import com.dayfour.collections.model.Employee;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 or 2");
		int input = sc.nextInt();
		EmployeeStorage es = EmployeeFactoryPattern.getInstance(input);

		int it = 0;
		do {
			System.out.println("Enter the Below Options");
			System.out.println("1.  Save");
			System.out.println("2.  Find By Id");
			System.out.println("3.  Find All");
			System.out.println("4.  Delete");
			System.out.println("5.  Exit");

			it = sc.nextInt();

			switch (it) {
			case 1:
				System.out.println("Enter employee Name");
				String name = sc.next();
				// sc.nextLine();
				System.out.println("Enter employee Salary");
				double salary = (double) sc.nextDouble();
				Employee e = new Employee(name, salary);
				System.out.println(es.save(e) + " Id is saved");
				break;
			case 2:
				System.out.println("Enter Employee Id");
				int id = sc.nextInt();
				try {
					System.out.println(es.findEmployee(id));
				} catch (EmployeeNotFoundException e1) {
					e1.printStackTrace();
				}
				break;
			case 3:
				Employee[] eAr = es.findEmployees();
				for (Employee temp : eAr) {
					System.out.println(temp);
				}
				break;
			case 4:
				System.out.println("Enter Employee Id to delete");
				int t = sc.nextInt();
				try {
					es.delete(t);
				} catch (EmployeeNotFoundException e1) {
					e1.printStackTrace();
				}
				break;
			default:
				System.out.println("Thanks, You're Exited");
				return;
			}

		} while (true);

	}

}
