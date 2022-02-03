package com.legatohealth.dao;

import java.util.List;

import com.legatohealth.beans.User;

public interface UserDao {
	public void store(User user);
	public User fetchUser(int userId);
	public List<User> fetchAll();
	public void deleteUser(int userId);
	public void updateUser(int userId, User u);

}
