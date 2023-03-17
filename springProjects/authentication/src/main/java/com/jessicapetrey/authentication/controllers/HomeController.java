package com.jessicapetrey.authentication.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jessicapetrey.authentication.services.UserService;


@Controller
public class HomeController {
	
	private UserService userServ;


	public HomeController(UserService userServ) {
		this.userServ = userServ;
	}

 
 @GetMapping("/welcome")
 public String index(HttpSession session, Model model) {
	 if(session.getAttribute("user_id") == null) {
		 return "redirect:/";
	 }
	 model.addAttribute("user", userServ.getOne((Long) session.getAttribute("user_id")));
     return "login&registration/dashboard.jsp";
 }
 
}
