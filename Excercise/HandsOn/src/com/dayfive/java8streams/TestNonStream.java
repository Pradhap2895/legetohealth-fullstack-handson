package com.dayfive.java8streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestNonStream {
	public static void main(String[] args) {
		List<Laptop> allLaptops = Laptop.getAllLaptops();

		List<Laptop> laptopsRamGT8 = new ArrayList<Laptop>();

		for (Laptop t : allLaptops) {
			if (t.getRam() > 8) {
				laptopsRamGT8.add(t);
			}
		}
		printAtUI(laptopsRamGT8);

		List<Laptop> laptopsgt8GbExceptHP = new ArrayList<Laptop>();
		for (Laptop t : laptopsRamGT8) {
			if (!(t.getName().equals("HP"))) {
				laptopsgt8GbExceptHP.add(t);
			}
		}
		printAtUI(laptopsgt8GbExceptHP);

		Collections.sort(laptopsgt8GbExceptHP, new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				return Double.compare(o1.getPrice(), o2.getPrice());
			}

		});

		printAtUI(laptopsgt8GbExceptHP);

	}

	public static void printAtUI(List<Laptop> list) {
		for (Laptop t : list) {
			System.out.println(t);
		}
		System.out.println("----------------------");
	}

}
