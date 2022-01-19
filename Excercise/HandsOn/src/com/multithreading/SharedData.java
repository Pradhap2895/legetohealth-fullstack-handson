package com.multithreading;

public class SharedData implements Runnable {

	@Override
	public synchronized void run() {
		String name = Thread.currentThread().getName();

		System.out.println(name + ", entered the run()");

		for (int i = 0; i <= 10; i++) {

			try {
				System.out.println("i= " + i);

				Thread.sleep(1000);
				if (name.equals("A") && i == 5) {
					wait();
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notifyAll();
		System.out.println(name + ", exits the run()");
	}

}
