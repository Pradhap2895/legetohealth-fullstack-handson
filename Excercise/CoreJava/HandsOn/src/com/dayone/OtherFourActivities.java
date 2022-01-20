package com.dayone;

public class OtherFourActivities {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter a name");
		 * String name = sc.next(); System.out.println(welcomeMsg(name)); sc.close();
		 * 
		 * System.out.println("LargestNumber= " + findLargestNumber(3, 9, 1));
		 * 
		 * System.out.println("Sum= " + getSum(9, 1, 3));
		 */

		System.out.println(convertNumbertoString(789));
	}

	public static String convertNumbertoString(int i) {
		String[] str = String.valueOf(i).split("");
		String output = "";

		int j = 0;
		while (j < str.length) {
			output = output +" "+ useSwitchCase(str[j]);
			j++;
		}
		return output;
	}

	public static String useSwitchCase(String s) {
		String resultStr = "";

		switch (s) {
		case "1":
			resultStr = "One";
			break;
		case "2":
			resultStr = "Two";
			break;
		case "3":
			resultStr = "Three";
			break;
		case "4":
			resultStr = "Four";
			break;
		case "5":
			resultStr = "Five";
			break;
		case "6":
			resultStr = "Six";
			break;
		case "7":
			resultStr = "Sevan";
			break;
		case "8":
			resultStr = "Eight";
			break;
		case "9":
			resultStr = "Nine";
			break;
		default:
			resultStr = "Zero";

		}

		return resultStr;
	}

	public static int getSum(int i, int j, int k) {

		int largest = findLargestNumber(i, j, k);
		int lowest = findLowestNuumber(i, j, k);
		return largest + lowest;
	}

	public static int findLowestNuumber(int i, int j, int k) {

		if (i < j && i < k) {
			return i;
		} else if (j < i && j < k) {
			return j;
		} else {
			return k;
		}
	}

	public static int findLargestNumber(int i, int j, int k) {

		if (i > j && i > k) {
			return i;
		} else if (j > i && j > k) {
			return j;
		} else {
			return k;
		}
	}

	public static String welcomeMsg(String name) {

		return "Hello " + name + ", Welcome to Java";
	}
}
