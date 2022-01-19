package com.dayfive.java8streams;

import java.util.List;
import java.util.stream.Collectors;

public class TestWithStream {
	public static void main(String[] args) {
		List<Laptop> allLaptops = Laptop.getAllLaptops();
		//TestNonStream.printAtUI(allLaptops);

		List<Laptop> laptopsRamGT8 = allLaptops.stream().filter(laptop -> laptop.getRam() > 8)
				.collect(Collectors.toList());
		TestNonStream.printAtUI(laptopsRamGT8);

		List<Laptop> laptopsgt8GbExceptHP = laptopsRamGT8.stream().filter(laptop -> !(laptop.getName().equals("HP")))
				.collect(Collectors.toList());
		TestNonStream.printAtUI(laptopsgt8GbExceptHP);

		List<Laptop> sortedList = laptopsgt8GbExceptHP.stream()
				.sorted((l1, l2) -> Double.compare(l1.getPrice(), l2.getPrice())).collect(Collectors.toList());
		TestNonStream.printAtUI(sortedList);
	}
}
