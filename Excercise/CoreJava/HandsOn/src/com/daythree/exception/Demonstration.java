package com.daythree.exception;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Demonstration {

	

	private static void usageOfThrows() throws IOException {

		String s = "tet";
		if (!s.isEmpty()) {
			FileReader fr = new FileReader("text.txt");
			fr.close();
			throw new IOException();
			
		} else {
			System.out.println("test ok");
		}

	}

	private static void nestedCatchBlock() {

		try {
			int t = 20;

			try {
				t /= 0;
			} catch (ArithmeticException ae) {
				ae.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void multipleCatchBlock() {
		int[] arr = { 1, 2, 3, 4, 5 };

		try {
			// arr[1] = 'c';
			arr[20] = 20;

		} catch (ArrayStoreException ase) {
			ase.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException aiob) {
			aiob.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void singleBlock() {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		try {
			int len = str.length();
			System.out.println("-" + str.charAt(len + 2));

		} catch (StringIndexOutOfBoundsException siob) {
			siob.printStackTrace();
			System.out.println("----");
		} finally {
			sc.close();
			System.out.println("scanner closed");
		}
	}

}
