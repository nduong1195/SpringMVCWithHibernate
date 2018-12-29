package com.fsoft.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fsoft.spring.model.User;
import com.fsoft.spring.repositories.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHomepage() {
		User user = new User("duongnv16", "123456");
		userRepository.inserUser(user);
		return "homepage";
	}
}
