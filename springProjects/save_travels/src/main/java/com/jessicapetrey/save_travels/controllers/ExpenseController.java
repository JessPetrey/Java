package com.jessicapetrey.save_travels.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jessicapetrey.save_travels.models.Expense;
import com.jessicapetrey.save_travels.services.ExpenseService;

//**************************** PAIR PROGRAMMING WITH ABRAR HUSSAIN  :)

@Controller
@RequestMapping("/expenses")
public class ExpenseController {
	private final ExpenseService expenseService;
	
	public ExpenseController(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}
	
	
	//get all
	@GetMapping("")
	public String index(Model model) {
		model.addAttribute("allExpenses", expenseService.getAll());
		model.addAttribute("expense", new Expense());
		return "/saveTravelsViews/index.jsp";
	}
	
	//get one
	@GetMapping("/{id}")
	public String showOne(@PathVariable("id") Long id, Model model) {
		model.addAttribute("oneExpense", expenseService.getOne(id));
		return "/saveTravelsViews/showOne.jsp";
	}
	
	//create one new
	@PostMapping("/process/new")
	public String processNewExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allExpenses", expenseService.getAll());
			return "/saveTravelsViews/index.jsp";
		}
		expenseService.create(expense);
		return "redirect:/expenses";
	}
	
	//select one to edit - renders showOne page
	@GetMapping("/edit/{id}")
    public String editOne(@PathVariable("id") Long id, Model model) {
        model.addAttribute("expense", expenseService.getOne(id));
        return "/saveTravelsViews/edit.jsp";
    }
	
	@PutMapping("/process/{id}")
	public String processExpenseEdit(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if(result.hasErrors()) {
			return "/saveTravelsViews/edit.jsp";
		}
		expenseService.update(expense);
		return "redirect:/expenses";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteExpense(@PathVariable("id") Long id) {
		expenseService.delete(id);
		return "redirect:/expenses";
	}

	
	
}
