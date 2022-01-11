package com.daytwo;

public class Person {

	private String name;
	private String gender;

	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
		System.out.println("Person(name,gender)");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void printInfo() {
		System.out.println("Printinfo inside Person");
		System.out.println("Name= " + name + " Gender= " + gender);
	}

}
