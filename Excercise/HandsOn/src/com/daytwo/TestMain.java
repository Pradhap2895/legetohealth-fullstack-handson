package com.daytwo;

public class TestMain {

	public static void main(String[] args) {
		StudentModel s1 = new StudentModel();
		StudentModel s2 = new StudentModel();
		StudentModel s3 = new StudentModel();

		s1.setStdId(01);
		s1.setStdName("Kishor");
		s1.setStdCity("Bangalore");
		s1.setMark1(63);
		s1.setMark2(79);
		s1.setMark3(99);
		s1.setFeePerMonth(200.0F);
		s1.setStdEligibleForScolarship(true);

		s2.setStdId(02);
		s2.setStdName("Deva");
		s2.setStdCity("Karnataka");
		s2.setMark1(50);
		s2.setMark2(58);
		s2.setMark3(34);
		s2.setFeePerMonth(500.0F);
		s2.setStdEligibleForScolarship(false);

		s3.setStdId(03);
		s3.setStdName("Pradhap");
		s3.setStdCity("Chennai");
		s3.setMark1(48);
		s3.setMark2(65);
		s3.setMark3(81);
		s3.setFeePerMonth(140.0F);
		s3.setStdEligibleForScolarship(true);

		if (s1.getTotalMarks() > s2.getTotalMarks() && s1.getTotalMarks() > s3.getTotalMarks()) {
			System.out.println("Highest Total Mark is " + s1.getStdName());
		} else if (s2.getTotalMarks() > s1.getTotalMarks() && s2.getTotalMarks() > s3.getTotalMarks()) {
			System.out.println("Highest Total Mark is " + s2.getStdName());
		} else {
			System.out.println("Highest Total Mark is " + s3.getStdName());
		}

		if (s1.getAnnualFee() < s2.getAnnualFee() && s1.getAnnualFee() < s3.getAnnualFee()) {
			System.out.println(
					"Who Pays the Least monthly Fee" + " Name=" + s1.getStdName() + " Fee=" + s1.getFeePerMonth());
		} else if (s2.getAnnualFee() < s1.getAnnualFee() && s2.getAnnualFee() < s3.getAnnualFee()) {
			System.out.println(
					"Who Pays the Least monthly Fee" + " Name=" + s2.getStdName() + " Fee=" + s2.getFeePerMonth());
		} else {
			System.out.println(
					"Who Pays the Least monthly Fee" + " Name=" + s3.getStdName() + " Fee=" + s3.getFeePerMonth());
		}

		System.out.println("---------------------------");
		printStudent(s1);
		System.out.println("---------------------------");
		printStudent(s2);
		System.out.println("---------------------------");
		printStudent(s3);
		System.out.println("---------------------------");

	}

	private static void printStudent(StudentModel s) {
		System.out.println("Name=" + s.getStdName() + " TotalMarks=" + s.getTotalMarks() + " AverageMarks="
				+ s.getAverage() + " Result=" + s.getResult()
				+ " Scholarship="+(s.isStdEligibleForScolarship() ? "Scholarship available" : "Scholarship not available"));
	}

}
