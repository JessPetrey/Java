package com.jessicapetrey.bookclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
//	bringing in services here means this has access to all the models
//	private final UserService userServ;
	
	public MainController() {
//		this.userServ = userServ;
	}

	@GetMapping("/")
	public String home() {
		return "main/dashboard.jsp";
	}
}
