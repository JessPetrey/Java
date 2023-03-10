package com.jessicapetrey.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//------------ port set to 8081 --------------


@RestController
public class HelloHumanController {
	@RequestMapping("")
	public String hello(@RequestParam(value="name", required=false) String nameInput, 
				@RequestParam(value="last_name", required=false) String lastName, 
				@RequestParam(value="num", required=false) Integer repeatTimes){
		if(nameInput == null) {
			return "Hello Human";			
		}
		if(lastName == null) {
			return "Hello " + nameInput;
		}
		if(repeatTimes == null) {
			return "Hello " + nameInput + " " + lastName;
		}
		String greetingRepeated = "Hello " + nameInput + " " + lastName + " ";
		return greetingRepeated.repeat(repeatTimes);
	}
}
