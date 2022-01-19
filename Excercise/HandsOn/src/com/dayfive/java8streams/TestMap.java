package com.dayfive.java8streams;

import java.util.*;
import java.util.stream.Collectors;

public class TestMap {
	public static void main(String[] args) {
		List<Laptop> allLaptops = Laptop.getAllLaptops();

		Set<String> laptopNames = allLaptops.stream().map(laptop -> laptop.getName()).collect(Collectors.toSet());

		Set<Integer> laptopsRam = allLaptops.stream().map(laptop -> laptop.getRam()).collect(Collectors.toSet());

		System.out.println(laptopNames);
		System.out.println(laptopsRam);

	}

}
