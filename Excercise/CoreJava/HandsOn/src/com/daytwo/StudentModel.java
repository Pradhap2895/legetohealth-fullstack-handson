package com.daytwo;

public class StudentModel {
	private int stdId;
	private String stdName;
	private String stdCity;
	private int mark1;
	private int mark2;
	private int mark3;
	private float feePerMonth;
	private boolean isStdEligibleForScolarship;
	

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdCity() {
		return stdCity;
	}

	public void setStdCity(String stdCity) {
		this.stdCity = stdCity;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

	public float getFeePerMonth() {
		return feePerMonth;
	}

	public void setFeePerMonth(float feePerMonth) {
		this.feePerMonth = feePerMonth;
	}

	public boolean isStdEligibleForScolarship() {
		return isStdEligibleForScolarship;
	}

	public void setStdEligibleForScolarship(boolean isStdEligibleForScolarship) {
		this.isStdEligibleForScolarship = isStdEligibleForScolarship;
	}

	public double getAnnualFee() {
		return feePerMonth * 12;
	}

	public int getTotalMarks() {
		return mark1 + mark2 + mark3;
	}

	public double getAverage() {
		return (mark1 + mark2 + mark3) / 3;
	}

	public String getResult() {
		return (mark1 > 60 && mark2 > 60 && mark3 > 60) ? "Pass" : "Fail";
	}

}
