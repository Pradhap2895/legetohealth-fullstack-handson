package com.legatohealth.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.legatohealth.beans.User;

@Repository
public class UserDaoJdbcTempImple implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void store(User user) {
		String insertQuery = "insert into user (name, password, age) values (?, ?, ?)";
		jdbcTemplate.update(insertQuery, user.getName(), user.getPassword(), user.getAge());

	}

	@Override
	public User fetchUser(int userId) {
		String selectUserQuery = "select * from user where userid = ?";
		/*
		 * queryForObject takes a RowMapper which returns a single user object based on
		 * the id the last argument is the id that maps to the ?
		 */
		User userObtained = jdbcTemplate.queryForObject(selectUserQuery, (rs, index) -> {
			User user = new User();
			user.setUserId(rs.getInt("userid"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
			user.setAge(rs.getInt("age"));
			return user;
		}, userId);
		return userObtained;
	}

	@Override
	public List<User> fetchAll() {
		List<User> users = new ArrayList<>();
		String fetchQuery = "select * from user";
		List<Map<String, Object>> datas = jdbcTemplate.queryForList(fetchQuery);
		for (Map row : datas) {
			User obj = new User();
			obj.setUserId((Integer) row.get("userid"));
			obj.setName((String) row.get("name"));
			obj.setPassword((String) row.get("password"));
			obj.setAge(((Integer) row.get("age")).intValue());
			users.add(obj);
		}
		return users;
	}

	@Override
	public void deleteUser(int userId) {
		String deletQuery = "delete from user where userid=?";
		jdbcTemplate.update(deletQuery, userId);

	}

	@Override
	public void updateUser(int userId, User u) {
		String updateQuery = "update user set name=?, password=?, age=? where userid=?";
		jdbcTemplate.update(updateQuery, u.getName(), u.getPassword(), u.getAge(), u.getUserId());
	}

}
