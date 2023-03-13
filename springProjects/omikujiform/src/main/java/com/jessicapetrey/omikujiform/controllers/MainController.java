package com.jessicapetrey.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MainController {
	@GetMapping("/omikuji")
	public String omikujiForm() {
		return "postForm/form.jsp";
	}
	
	@PostMapping("/omikuji/process/form")
	public String processForm(
			@RequestParam("num") int num, 
			@RequestParam("city") String city,
			@RequestParam("name") String name, 
			@RequestParam("activity") String activity, 
			@RequestParam("livingThing") String livingThing, 
			@RequestParam("niceThingToSay") String niceThingToSay,
			HttpSession session) {
		session.setAttribute("num", num);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("activity", activity);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("niceThingToSay", niceThingToSay);
		return "redirect:/omikuji/show";
	}
	
	@GetMapping("/omikuji/show")
	public String displayFortune() {
		return "displayFortune/display.jsp";
	}
}
