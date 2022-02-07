package com.legatohealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legatohealth.bean.CustomMessage;
import com.legatohealth.bean.User;
import com.legatohealth.exception.UserNotFoundException;
import com.legatohealth.service.UserService;

@RestController
@RequestMapping("crudapi")
public class UserRestController {

	@Autowired
	private UserService userService;

	@PostMapping(path = "/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveUser(@RequestBody User user) {

		ResponseEntity<Object> response = null;
		User createdUser = userService.store(user);
		response = ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
		return response;
	}

	@GetMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> fetchAll() {

		ResponseEntity<Object> response = null;
		List<User> listUsers = userService.fetchAll();
		response = ResponseEntity.status(HttpStatus.OK).body(listUsers);
		return response;
	}

	@DeleteMapping(path = "/user/{userid}")
	public ResponseEntity<Object> deleteUser(@PathVariable("userid") int id) {
		ResponseEntity<Object> response = null;
		CustomMessage msg = null;
		try {
			userService.deleteUser(id);
			msg = new CustomMessage("User with id " + id + " is deleted", 200);
			response = ResponseEntity.status(HttpStatus.OK).body(msg);
		} catch (UserNotFoundException e) {
			msg = new CustomMessage(e.getMessage(), 400);
			response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(msg);
		}
		return response;
	}

	@GetMapping(path = "/user/{userid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> findUser(@PathVariable("userid") int id) {
		ResponseEntity<Object> response = null;
		CustomMessage msg = null;
		try {
			User u = userService.fetchUser(id);
			response = ResponseEntity.status(HttpStatus.OK).body(u);
		} catch (UserNotFoundException e) {
			msg = new CustomMessage(e.getMessage(), 400);
			response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(msg);
		}
		return response;
	}

	@PutMapping(path = "/user/{userid}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updateUserPassword(@PathVariable("userid") int id, @RequestBody User user) {
		ResponseEntity<Object> response = null;
		CustomMessage msg = null;
		String name = user.getName();
		String password = user.getPassword();
		int age = user.getAge();
		User updatedUser = null;
		try {
			if (password != null) {
				updatedUser = userService.updatePassword(id, password);
			} else if (name != null) {
				updatedUser = userService.updateName(id, name);
			} else if (age != 0) {
				updatedUser = userService.updateAge(id, age);
			}

			// msg = new CustomMessage("User with id " + id + " is updated", 200);
			response = ResponseEntity.status(HttpStatus.OK).body(updatedUser);
		} catch (UserNotFoundException e) {
			msg = new CustomMessage(e.getMessage(), 400);
			response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(msg);
		}
		return response;
	}

	@GetMapping(value = "/test")
	public ResponseEntity<Object> testing() {
		ResponseEntity<Object> response = null;
		User user = new User();
		user.setUserId(12);
		user.setName("Test");
		user.setAge(3);
		response = ResponseEntity.status(HttpStatus.OK).body(user);
		return response;
	}
}
