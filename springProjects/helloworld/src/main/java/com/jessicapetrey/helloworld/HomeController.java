package com.jessicapetrey.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {
	@RequestMapping("")
	public String index() {
		return "Hello World this is the class annotation";
	}
	
	@RequestMapping("/jess")
	public String quote() {
		return "Happiness can be found in the darkest of times, "
				+ "if one only remembers to turn on the light.";
	}
}
