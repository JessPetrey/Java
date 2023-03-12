package com.jessicapetrey.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/your_server")
	public String index(HttpSession session) {
		session.setAttribute("name", "User");
		if (session.getAttribute("count") == null ) {
			session.setAttribute("count", 0);
		} else {
			Integer num = (Integer) session.getAttribute("count") + 1;
			session.setAttribute("count", num);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/your_server/counter")
	public String visitCounter(HttpSession session, Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("numToDisplay", currentCount);
		return "showCount.jsp";
	}

}