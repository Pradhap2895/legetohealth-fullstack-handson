package com.multithreading;

public class Test implements Runnable {

	public void demo() {
		for (int i = 0; i <= 30; i++) {
			System.out.println("i= " + i + ", name= " + Thread.currentThread().getName());
		}
	}

	@Override
	public void run() {
		demo();
	}

}
