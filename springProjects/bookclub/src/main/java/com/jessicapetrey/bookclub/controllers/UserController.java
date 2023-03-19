package com.jessicapetrey.bookclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jessicapetrey.bookclub.models.LoginUser;
import com.jessicapetrey.bookclub.models.User;

@Controller
@RequestMapping("/users")
public class UserController {

	public UserController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@GetMapping("/login/reg")
	public String loginReg(@ModelAttribute("newUser") User user, @ModelAttribute("loginUser") LoginUser loginUser) {
		return "user/loginReg.jsp";
	}
	
	
}
