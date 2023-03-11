package com.jessicapetrey.hoppersreciept.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecieptController {
	@RequestMapping("/")
	public String index(Model model) {
		String name = "Grace Hopper";
		String itemName = "Copper wire";
		double price = 5.25;
		String description = "Metal strips, also and illustration of nanoseconds.";
		String vendor = "Little Things Corner Store";
		
		model.addAttribute("name", name);
		model.addAttribute("item", itemName);
		model.addAttribute("price", price);
		model.addAttribute("description", description);
		model.addAttribute("vendor", vendor);
		
		
		model.addAttribute("name", "Jessica Rabbit");
		model.addAttribute("item", "Carrots");
		model.addAttribute("price", 3.99);
		model.addAttribute("description", "Orange crunchy snack.");
		model.addAttribute("vendor", "Whole Foods Market");
		
		return "index.jsp";
	}
}
