package com.daytwo;

public class Student extends Person {

	private int rollNo;
	private String grade;

	public Student(int rollNo, String name, String gender, String grade) {
		super(name, gender);
		this.rollNo = rollNo;
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getRollNo() {
		return rollNo;
	}

	@Override
	public void printInfo() {
		System.out.println("RollNo= " + rollNo + "  Name= " + getName() + " Gender= " + getGender() + " Grade= " + grade);
	}

}
