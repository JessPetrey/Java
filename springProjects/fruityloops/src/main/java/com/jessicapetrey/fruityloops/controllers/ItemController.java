package com.jessicapetrey.fruityloops.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jessicapetrey.fruityloops.models.Item;
import java.util.ArrayList;

@Controller
public class ItemController {
	
	@RequestMapping("/")
	public String index(Model model) {
		
		ArrayList<Item> fruits = new ArrayList<Item>();
		fruits.add(new Item("Kiwi", 1.5));
		fruits.add(new Item("Mango", 2.0));
		fruits.add(new Item("Goji Berries", 4.0));
		fruits.add(new Item("Guava", .75));
		
		//add to view model
		model.addAttribute("allItems", fruits);
		
		return "index.jsp";
	}
}
