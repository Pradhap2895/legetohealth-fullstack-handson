package com.dayfive.java8streams;

import java.util.List;
import java.util.stream.Collectors;

public class TestActivity {
	public static void main(String[] args) {

		List<Laptop> allLaptops = Laptop.getAllLaptops();
		useForEach(allLaptops);
		System.out.println("stream count= " + useOfCounts(allLaptops));
		List<Laptop> output = useOfParallStream(allLaptops);
		TestNonStream.printAtUI(output);
	}

	private static List<Laptop> useOfParallStream(List<Laptop> allLaptops) {
		return allLaptops.parallelStream().filter(laptops -> !(laptops.getName().equals("HP")))
				.collect(Collectors.toList());

	}

	private static int useOfCounts(List<Laptop> allLaptops) {
		return (int) allLaptops.stream().filter(laptop -> laptop.getRam() > 8).count();
	}

	private static void useForEach(List<Laptop> allLaptops) {
		allLaptops.stream().map(laptop -> laptop.getName()).collect(Collectors.toSet()).forEach(System.out::println);
	}

}
