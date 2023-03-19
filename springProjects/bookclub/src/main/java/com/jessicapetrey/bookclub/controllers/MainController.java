package com.jessicapetrey.bookclub.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jessicapetrey.bookclub.services.BookService;
import com.jessicapetrey.bookclub.services.UserService;

@Controller
public class MainController {
	
	private final UserService userServ;
	private final BookService bookService;

	public MainController(UserService userServ, BookService bookService) {
		this.userServ = userServ;
		this.bookService = bookService;
	}

 
 @GetMapping("/books")
 public String index(HttpSession session, Model model) {
	 if(session.getAttribute("user_id") == null) {
		 return "redirect:/users";
	 }
	 model.addAttribute("user", userServ.getOne((Long) session.getAttribute("user_id")));
	 model.addAttribute("allBooks", bookService.getAll());
     return "main/dashboard.jsp";
 }
 
}