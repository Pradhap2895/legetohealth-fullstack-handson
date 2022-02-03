package com.legatohealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.legatohealth.beans.User;
import com.legatohealth.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void saveUSer(User user) {
		userDao.store(user);

	}

	@Override
	public User fetchUser(int userId) {

		return userDao.fetchUser(userId);
	}

	@Override
	public List<User> fetchAllUser() {

		return userDao.fetchAll();
	}

	@Override
	public void deleteUser(int userId) {
		userDao.deleteUser(userId);

	}

	@Override
	public void updateName(int userId, String name) {

		User u = fetchUser(userId);
		u.setName(name);
		userDao.updateUser(userId, u);

	}

	@Override
	public void updatePassword(int userId, String password) {
		User u = fetchUser(userId);
		u.setPassword(password);
		userDao.updateUser(userId, u);

	}

	@Override
	public void updateAge(int userId, int age) {
		User u = fetchUser(userId);
		u.setAge(age);
		userDao.updateUser(userId, u);
	}

}
