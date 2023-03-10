package com.jessicapetrey.controllerspractice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// ----------------- port set to 8081 -----------------

@RestController
@RequestMapping("/hello")
public class HomeController {
	@RequestMapping("")
	public String hello() {
		return "Hello World!";
	}
	@RequestMapping("/world")
	public String world() {
		return "Class level annotation";
	}
	

}
