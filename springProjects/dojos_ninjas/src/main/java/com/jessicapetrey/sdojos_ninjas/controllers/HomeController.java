package com.jessicapetrey.sdojos_ninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jessicapetrey.sdojos_ninjas.models.Dojo;
import com.jessicapetrey.sdojos_ninjas.models.Ninja;
import com.jessicapetrey.sdojos_ninjas.services.DojoService;
import com.jessicapetrey.sdojos_ninjas.services.NinjaService;

@Controller
public class HomeController {
	public final DojoService dojoServ;
	public final NinjaService ninjaServ;
	
	public HomeController(DojoService dojoServ, NinjaService ninjaServ) {
		this.dojoServ = dojoServ;
		this.ninjaServ = ninjaServ;
	}
//	dashboard page
	@GetMapping("/")
	public String index(Model model) {
		//	shows all the created dojos as links
		model.addAttribute("allDojos", dojoServ.findAll());
		return "main/index.jsp";
	}
	
//	create dojo form
	@GetMapping("/dojos/new")
	public String createDojo(@ModelAttribute("newDojo") Dojo newDojo) {
		return "dojo/form.jsp";
	}
	
//	create route - upon dojo form submit
	@PostMapping("/dojos/process/new")
	public String processNewDojo(@Valid @ModelAttribute("newDojo") Dojo newDojo, BindingResult result) {
		if(result.hasErrors()) {
			return "dojo/form.jsp";
		}
		dojoServ.create(newDojo);
		return "redirect:/";
	}

	
//	ninja form page
	@GetMapping("/ninjas/new")
	public String createNinja(@ModelAttribute("newNinja") Ninja newNinja, Model model) {
		//  this is needed to populate the dropdown with the dojos
		model.addAttribute("allDojos", dojoServ.findAll());
		return "ninja/form.jsp";
	}
	
//	create route - ninja form submit
	@PostMapping("/ninjas/process/new")
	public String processNewNinja(@Valid @ModelAttribute("newNinja") Ninja newNinja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			// if errors, reload, still need the dojos
			model.addAttribute("allDojos", dojoServ.findAll());
			return "ninja/form.jsp";
		}
		ninjaServ.create(newNinja);
		return "redirect:/";
	}
	
//	show one dojo with ninjas page - render upon clicking a dojo
	@GetMapping("/dojos/{id}")
	public String showOneDojosNinjas(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dojoServ.getOne(id));
		return "dojo/showOne.jsp";
	}
	
	
	
	
	
	
	
}
