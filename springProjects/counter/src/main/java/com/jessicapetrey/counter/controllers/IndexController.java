package com.jessicapetrey.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/your_server")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null ) {
			session.setAttribute("count", 0);
		} else {
			session.setAttribute("count", (Integer) session.getAttribute("count") + 1);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/your_server/counter")
	public String visitCounter(HttpSession session) {
		session.getAttribute("count");
		return "showCount.jsp";
	}

}