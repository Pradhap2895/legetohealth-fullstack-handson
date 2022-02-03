package com.legatohealth.service;

import java.util.List;

import com.legatohealth.beans.User;

public interface UserService {

	public void saveUSer(User user);
	public User fetchUser(int userId);
	public List<User> fetchAllUser();
	public void deleteUser(int userId);
	public void updateName(int userId, String name);
	public void updatePassword(int userId, String password);
	public void updateAge(int userId, int age);
	
}
