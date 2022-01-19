package com.multithreading;

public class TestThreads {
	public static void main(String[] args) {

		SharedData t = new SharedData();

		Thread t1 = new Thread(t, "A");
		t1.start();
		Thread t2 = new Thread(t, "B");
		t2.start();
		Thread t3 = new Thread(t, "C");
		t3.start();

		System.out.println("Main closed");

	}

}
