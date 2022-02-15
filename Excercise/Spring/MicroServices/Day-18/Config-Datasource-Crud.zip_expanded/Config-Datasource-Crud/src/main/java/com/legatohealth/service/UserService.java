package com.legatohealth.service;

import java.util.List;

import com.legatohealth.bean.User;
import com.legatohealth.exception.UserNotFoundException;

public interface UserService {

	public User store(User user);

	public User fetchUser(int id) throws UserNotFoundException;

	public void deleteUser(int id) throws UserNotFoundException;

	public User updatePassword(int id, String password) throws UserNotFoundException;

	public User updateName(int id, String name) throws UserNotFoundException;

	public User updateAge(int id, int Age) throws UserNotFoundException;

	public List<User> fetchAll();
}
