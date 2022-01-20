package com.daytwo;

public class TestPoly {
	public static void main(String[] args) {
		Person p = new Person("Praveen", "Male");
		print(p);
		System.out.println("---------------------------");
		Person e = new Employee(102, "Naga", "Male", 2000.0);
		print(e);
		System.out.println("---------------------------");
		Person s = new Student(78, "Ranjith", "Male", "E");
		print(s);
		System.out.println("---------------------------");
		Customer c = new Customer(12, 2898789, 15000.0, "Kumar", "Male");
		print(c);
		System.out.println("---------------------------");
	}

	private static void print(Person p) {
		p.printInfo();
	}

}
