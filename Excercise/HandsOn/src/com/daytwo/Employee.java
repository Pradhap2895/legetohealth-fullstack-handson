package com.daytwo;

public class Employee extends Person {

	private int id;
	private double salary;

	public Employee(int id, String name, String gender, double salary) {
		super(name, gender);
		this.id = id;
		this.salary = salary;

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	@Override
	public void printInfo() {
		System.out.println("Employee Info");
		System.out.println("Id= " + id + " Name= " + getName() + " Gender= " + getGender() + " Salary= " + salary);
	}

}
