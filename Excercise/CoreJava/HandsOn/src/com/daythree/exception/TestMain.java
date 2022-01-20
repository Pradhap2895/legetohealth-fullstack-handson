package com.daythree.exception;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		UserService us = new UserService();

		try {
			us.searchUser(id);
		} catch (UserNotFoundException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}

	}
}
