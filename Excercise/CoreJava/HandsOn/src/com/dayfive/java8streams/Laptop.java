package com.dayfive.java8streams;

import java.util.ArrayList;
import java.util.List;

public class Laptop {

	public Laptop(int ram, String name, double price) {
		super();
		this.ram = ram;
		this.name = name;
		this.price = price;
	}

	private int ram;
	private String name;
	private double price;

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static List<Laptop> getAllLaptops() {
		List<Laptop> list = new ArrayList<Laptop>();
		Laptop l1 = new Laptop(8, "HP", 80000);
		Laptop l2 = new Laptop(4, "HP", 45000);
		Laptop l3 = new Laptop(2, "HP", 32000);
		Laptop l4 = new Laptop(16, "HP", 99000);
		Laptop l5 = new Laptop(32, "HP", 122000);
		Laptop l6 = new Laptop(4, "HP", 42000);
		Laptop l7 = new Laptop(6, "HP", 54000);
		Laptop l8 = new Laptop(8, "HP", 76000);
		Laptop l9 = new Laptop(16, "HP", 1020000);

		Laptop l11 = new Laptop(8, "DELL", 80000);
		Laptop l12 = new Laptop(4, "DELL", 45000);
		Laptop l13 = new Laptop(2, "DELL", 32000);
		Laptop l14 = new Laptop(16, "DELL", 99000);
		Laptop l15 = new Laptop(32, "DELL", 122000);
		Laptop l16 = new Laptop(4, "DELL", 42000);
		Laptop l17 = new Laptop(6, "DELL", 54000);
		Laptop l18 = new Laptop(8, "DELL", 76000);
		Laptop l19 = new Laptop(16, "DELL", 1020000);

		Laptop l21 = new Laptop(8, "Lenovo", 80000);
		Laptop l22 = new Laptop(4, "Lenovo", 45000);
		Laptop l23 = new Laptop(2, "Lenovo", 32000);
		Laptop l24 = new Laptop(16, "Lenovo", 87000);
		Laptop l25 = new Laptop(32, "Lenovo", 155000);
		Laptop l26 = new Laptop(4, "Lenovo", 42000);
		Laptop l27 = new Laptop(6, "Lenovo", 54000);
		Laptop l28 = new Laptop(8, "Lenovo", 76000);
		Laptop l29 = new Laptop(16, "Lenovo", 1340000);
		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		list.add(l5);
		list.add(l6);
		list.add(l7);
		list.add(l8);
		list.add(l9);

		list.add(l11);
		list.add(l12);
		list.add(l13);
		list.add(l14);
		list.add(l15);
		list.add(l16);
		list.add(l17);
		list.add(l18);
		list.add(l19);

		list.add(l21);
		list.add(l22);
		list.add(l23);
		list.add(l24);
		list.add(l25);
		list.add(l26);
		list.add(l27);
		list.add(l28);
		list.add(l29);
		return list;
	}

	@Override
	public String toString() {
		return "ram=" + ram + ", name=" + name + ", price=" + price;
	}

}
