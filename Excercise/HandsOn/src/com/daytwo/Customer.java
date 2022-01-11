package com.daytwo;

public class Customer extends Person {

	private int customerId;
	private long accountNo;
	private double balance;

	public Customer(int customerId, long accountNo, double balance, String name, String gender) {
		super(name, gender);
		this.customerId = customerId;
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getCustomerId() {
		return customerId;
	}

	@Override
	public void printInfo() {
		System.out.println(" customerId= " + customerId + " Name= " + getName() + " Gender= " + getGender() + " AccountNo= "
				+ accountNo + " Balance= " + balance);
	}
}
