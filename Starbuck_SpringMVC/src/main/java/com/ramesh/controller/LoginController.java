package com.ramesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.ramesh.domain.User;
import com.ramesh.service.UserService;

@Controller
@SessionAttributes({"user"})
public class LoginController {
	@Autowired
	UserService userService;
	@RequestMapping(value= {"/", "login"}, method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String userLogin(User user, Model model) {
		if(user.getUserName() == null && user.getPassword() == null) {
			System.out.println("user from login");
			return "login";
		}
		User userReturned = userService.findUser(user);
		if(userReturned == null || !userReturned.getPassword().equals(user.getPassword())) {
			System.out.println("return user from login");
			return "login";
		}
		// add session variable
		model.addAttribute("user", userReturned);
		return "login-successfull";
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(SessionStatus status) {
		status.setComplete();
		return "login";
	}
}
