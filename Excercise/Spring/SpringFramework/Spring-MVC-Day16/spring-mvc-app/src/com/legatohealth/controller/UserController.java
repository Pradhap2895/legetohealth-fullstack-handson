package com.legatohealth.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.legatohealth.beans.User;
import com.legatohealth.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteUser(@RequestParam("id") int userId) {

		System.out.println("-id-" + userId);
		userServiceImpl.deleteUser(userId);

		return new ModelAndView("storeSuccess", "msg", "Deleted Successfully");
	}

	@RequestMapping(value = "/findById", method = RequestMethod.GET)
	public ModelAndView fetchById(@RequestParam("id") int id) {
		System.out.println("-->id=" + id);
		User user = userServiceImpl.fetchUser(id);
		System.out.println(user);
		return new ModelAndView("storeSuccess", "u", user);
	}

	@RequestMapping(value = "/fetchAll", method = RequestMethod.GET)
	public ModelAndView fetchAll() {
		List<User> users = userServiceImpl.fetchAllUser();
		users.forEach(System.out::println);
		return new ModelAndView("storeSuccess", "users", users);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView store(@RequestParam("name") String name, @RequestParam("pass") String password,
			@RequestParam("age") int age) {

		User user = new User();
		user.setName(name);
		user.setPassword(password);
		user.setAge(age);

		userServiceImpl.saveUSer(user);

		return new ModelAndView("storeSuccess", "msg", "Stored Successfully");
	}

	@RequestMapping(value = "/updateName", method = RequestMethod.POST)
	public ModelAndView updateName(@RequestParam("id") int userId, @RequestParam("name") String name) {

		userServiceImpl.updateName(userId, name);

		return new ModelAndView("storeSuccess", "msg", "Record " + userId + "'s name is updated");
	}

	@RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
	public ModelAndView updatePassword(@RequestParam("id") int userId, @RequestParam("pass") String password) {

		userServiceImpl.updatePassword(userId, password);

		return new ModelAndView("storeSuccess", "msg", "Record " + userId + "'s password is updated");
	}

	@RequestMapping(value = "/updateAge", method = RequestMethod.POST)
	public ModelAndView updateAge(@RequestParam("id") int userId, @RequestParam("age") int age) {

		userServiceImpl.updateAge(userId, age);

		return new ModelAndView("storeSuccess", "msg", "Record " + userId + "'s age is updated");
	}

	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public ModelAndView home() {
		LocalDateTime modelDateTime = LocalDateTime.now();

		ModelAndView mav = new ModelAndView("welcome", "date", modelDateTime);

		return mav;
	}

}
