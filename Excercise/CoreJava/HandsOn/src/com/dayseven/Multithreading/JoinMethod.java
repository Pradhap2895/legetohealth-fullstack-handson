package com.dayseven.Multithreading;

public class JoinMethod {

	public static void main(String[] args) {

		Test t = new Test();

		try {
			Thread t1 = new Thread(t, "A");
			t1.start();
			t1.join(500);

			Thread t2 = new Thread(t, "B");
			t2.start();
			t2.join(500);

			Thread t3 = new Thread(t, "C");
			t3.start();
			t3.join(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Main closed");
	}
}
