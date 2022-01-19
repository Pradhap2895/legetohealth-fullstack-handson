package com.multithreading;

public class TicketBooking implements Runnable {

	private static int availabletickets = 1;

	@Override
	public void run() {
		book();

	}

	private void book() {
		String name = Thread.currentThread().getName();
		System.out.println("name " + name + " entered");
		if (availabletickets != 0) {
			System.out.println("name= " + name + ", got the ticket");
			availabletickets--;
		} else
			System.out.println("name= " + name + ", didn't got the ticket");

	}

}
