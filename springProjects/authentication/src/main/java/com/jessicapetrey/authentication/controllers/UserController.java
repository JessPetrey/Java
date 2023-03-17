package com.jessicapetrey.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jessicapetrey.authentication.models.LoginUser;
import com.jessicapetrey.authentication.models.User;
import com.jessicapetrey.authentication.services.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	private final UserService userServ;

	public UserController(UserService userServ) {
		this.userServ = userServ;
	}
	
	// Bind empty User and LoginUser objects to the JSP
	// to capture the form input
	@GetMapping("")
	public String loginReg(@ModelAttribute("newUser") User user,
			@ModelAttribute("loginUser") LoginUser loginUser, HttpSession session) {
		if(session.getAttribute("user_id") != null) {
			return "redirect:/welcome";
		}
		return "login&registration/index.jsp";
	}
	
	 @PostMapping("/register/process")
	 public String register(@Valid @ModelAttribute("newUser") User newUser, 
	         BindingResult result, Model model, HttpSession session) {
		 
		 User registeredUser = userServ.register(newUser, result);
	     if(result.hasErrors()) {
	         // Be sure to send in the empty LoginUser before 
	         // re-rendering the page.
	         model.addAttribute("loginUser", new LoginUser());
	         return "login&registration/index.jsp";
	     }
	     // No errors! 
	     // TO-DO Later: Store their ID from the DB in session, 
	     // in other words, log them in.
	     
	     session.setAttribute("user_id", registeredUser.getId());
	     return "redirect:/welcome";
	 }
	 
	 @PostMapping("/login")
	 public String login(@Valid @ModelAttribute("loginUser") LoginUser loginUser, 
	         BindingResult result, Model model, HttpSession session) {
	     
	     // Add once service is implemented:
	     // User user = userServ.login(newLogin, result);
		 User returningUser = userServ.login(loginUser, result);
	     if(result.hasErrors()) {
	         model.addAttribute("newUser", new User());
	         return "login&registration/index.jsp";
	     }
	 
	     // No errors! 
	     // TO-DO Later: Store their ID from the DB in session, 
	     // in other words, log them in.
	     session.setAttribute("user_id", returningUser.getId());
	     return "redirect:/welcome";
	 }
	 
	 
//	 remove user's id from session
	 @GetMapping("/logout")
	 public String logout(HttpSession session) {
		 session.invalidate();
		 return "redirect:/users";
	 }
	 
}
