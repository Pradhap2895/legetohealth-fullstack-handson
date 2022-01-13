package com.daythree.exception;

public class UserService {

	User u1 = new User(1, "Pradhap", 26);
	User u2 = new User(2, "Praveen", 27);
	User u3 = new User(1, "Packia", 32);

	User[] uarr = { u1, u2, u3 };

	public void searchUser(int id) throws UserNotFoundException {
		User result = new User();
		for (int i = 0; i < uarr.length; i++) {
			if (id == uarr[i].getId()) {
				result = uarr[i];
			}
		}

		if (result.getId() != 0) {
			System.out.println(result);
		} else {
			throw new UserNotFoundException("User id " + id + " is not found");
		}
	}

}
