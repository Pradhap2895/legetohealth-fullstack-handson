package com.dayone;

import java.util.Scanner;

public class FirstActivity {

	public static void main(String[] args) {
		testLoops();
	}

	public static void testLoops() {

		int counter = 10;

		while (counter <= 5) {
			System.out.println("while loop counter: " + counter);
			counter++;
		}

		int anotherCounter = 10;

		do {
			System.out.println("do..while loop counter: " + anotherCounter);
			anotherCounter++;
		} while (anotherCounter <= 5);
	}

	public static void testArrays() {
		String[] fruits = { "Mango", "Apple", "Banana", "Orange" };

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(i + "=" + fruits[i]);
		}

		System.out.println("----------------");
		int[] items = new int[5];
		items[0] = 10;
		items[1] = 20;
		items[2] = 30;
		items[3] = 40;
		items[4] = 50;
		// items[5] = 60;

		for (int i : items) {
			System.out.println("= " + i);
		}
	}

	public static void testKbInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a int value");
		int intValue = scan.nextInt();
		System.out.println("Enter double value");
		double doubleValue = scan.nextDouble();
		System.out.println("Enter a String");
		String s1 = scan.next();
		scan.nextLine();
		System.out.println("Enter another string");
		String s2 = scan.nextLine();

		System.out.println("Int= " + intValue + ", Double Value= " + doubleValue + ", S1= " + s1 + ", S2= " + s2);

		scan.close();
	}

	public static void testConditions() {

		int marks = 57;

		if (marks >= 70) {
			System.out.println("First Class with distinction: A+ ");
		} else if (marks < 70 && marks >= 60) {
			System.out.println("First Class: A");
		} else if (marks < 60 && marks >= 50) {
			System.out.println("Second Class: B");
		} else if (marks < 50 && marks >= 40) {
			System.out.println("Just Pass: C");
		} else {
			System.out.println("Failed");
		}

		String grade = "C";

		switch (grade) {
		case "A+":
			System.out.println("Distinction: A+");
			break;
		case "A":
			System.out.println("First Class: A");
			break;
		case "B":
			System.out.println("Second Class: B");
			break;
		case "C":
			System.out.println("Just Pass");
			break;
		default:
			System.out.println("Failed");
		}
	}

	public static void testOperators() {
		int x = 20;
		int y = x++;
		System.out.println("x=" + x + ", y=" + y);
		int a = 30;
		int b = ++a;
		System.out.println("a=" + a + ", b=" + b);
		boolean status = a > x;
		System.out.println("Status = " + status);
		status = a == x;
		System.out.println("status= " + status);
		status = a != x;
		System.out.println("status= " + status);
	}

	public static void testDataTypes() {
		byte byteValue = 127;
		int intValue = 1222;
		long longValue = 989890098989L;
		float floatValue = 989.8989f;
		double doubleValue = 898.09090;

		int charValue = 'A';
		char charValue2 = 'B';
		char charValue3 = 98;

		System.out.println("Byte Value: " + byteValue);
		System.out.println("Int Value: " + intValue);
		System.out.println(("Long Value: " + longValue));
		System.out.println("Float Value: " + floatValue);
		System.out.println("Double Value: " + doubleValue);
		System.out.println("Char Value1: " + charValue);
		System.out.println("Char Value2: " + charValue2);
		System.out.println("Char Value3: " + charValue3);
	}
}
