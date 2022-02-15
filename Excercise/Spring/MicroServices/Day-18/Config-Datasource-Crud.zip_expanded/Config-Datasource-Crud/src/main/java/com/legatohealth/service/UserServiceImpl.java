package com.legatohealth.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.legatohealth.bean.User;
import com.legatohealth.dao.UserDao;
import com.legatohealth.exception.UserNotFoundException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public User store(User user) {
		return userDao.save(user);
	}

	@Override
	public User fetchUser(int id) throws UserNotFoundException {
		return userDao.findById(id).orElseThrow(() -> new UserNotFoundException("User not found with id - " + id));
	}

	@Override
	@Transactional
	public void deleteUser(int id) throws UserNotFoundException {
		userDao.deleteById(id);

	}

	@Override
	@Transactional
	public User updatePassword(int id, String password) throws UserNotFoundException {
		User u = fetchUser(id);
		u.setPassword(password);
		return userDao.save(u);
	}

	@Override
	public List<User> fetchAll() {
		return userDao.findAll();
	}

	@Override
	public User updateName(int id, String name) throws UserNotFoundException {
		User u = fetchUser(id);
		u.setName(name);
		return userDao.save(u);
	}

	@Override
	public User updateAge(int id, int age) throws UserNotFoundException {
		User u = fetchUser(id);
		u.setAge(age);
		return userDao.save(u);
	}

}
