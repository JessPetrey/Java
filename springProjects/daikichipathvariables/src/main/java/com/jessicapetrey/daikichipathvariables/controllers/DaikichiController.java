package com.jessicapetrey.daikichipathvariables.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//------------ port set to 8081 --------------

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String greeting() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String todaysFortune() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrowsPrediction() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	// ------------- add new routes using path variables -------------
	
	@RequestMapping("/travel/{destination}")
	public String travelDestination(@PathVariable("destination") String dest) {
		return "Congratulations! You will soon travel to " + dest + "!";
	}
	
	@RequestMapping("/lotto/{number}")
	public String lottoNumber(@PathVariable("number") int num) {
		if(num%2 == 0) {
			return "You will take a grand journey in the near future, "
					+ "but be wary of tempting offers.";
		}
		return "You have enjoyed the fruits of your labor but now is a "
				+ "great itme to spend time with family and friends.";
	}

}
