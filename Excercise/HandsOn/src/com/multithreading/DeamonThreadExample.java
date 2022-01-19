package com.multithreading;

public class DeamonThreadExample {

	public static void main(String[] args) {

		Test t = new Test();

		Thread t1 = new Thread(t, "A");
		t1.setDaemon(true);
		t1.start();
		Thread t2 = new Thread(t, "B");
		t2.setDaemon(true);
		t2.start();
		Thread t3 = new Thread(t, "C");
		t3.setDaemon(true);
		t3.start();

		System.out.println("Main closed");
	}

}
