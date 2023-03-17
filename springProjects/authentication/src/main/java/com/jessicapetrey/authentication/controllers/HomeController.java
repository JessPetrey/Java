package com.jessicapetrey.authentication.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	public HomeController() {}

 
 @GetMapping("/")
 public String index(HttpSession session) {
	 if(session.getAttribute("user_id") == null) {
		 return "redirect:/users/login/register";
	 }
	 
     return "login&registration/dashboard.jsp";
 }
 
}
