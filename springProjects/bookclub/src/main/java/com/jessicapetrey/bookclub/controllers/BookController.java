package com.jessicapetrey.bookclub.controllers;

import javax.servlet.http.HttpSession;
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

import com.jessicapetrey.bookclub.models.Book;
import com.jessicapetrey.bookclub.services.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	private final BookService bookService;
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping("/new")
	public String createBook(@ModelAttribute("book") Book book, HttpSession session) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/users";
		}
		return "/book/create.jsp";
	}
	
	@PostMapping("/process/new")
	public String processNewBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "book/create.jsp";
		}
		bookService.create(book);
		return "redirect:/books";
		
	}
	
//	show one
	@GetMapping("/{id}")
	public String show(@PathVariable("id")Long id, Model model) {		
		model.addAttribute("book", bookService.getOne(id));
		return "/book/showOne.jsp";
	}
	
	
	
//	edit one book
	@GetMapping("/{id}/edit")
	public String editBook(@PathVariable("id")Long id, Model model) {		
		model.addAttribute("book", bookService.getOne(id));
		return "/book/edit.jsp";
	}

	@PutMapping("/process/{id}/edit")
	public String processEditBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "book/edit.jsp";
		}
		bookService.update(book);
		return "redirect:/books";
	}
		
	@DeleteMapping("/{id}/delete")
	public String delete(@PathVariable("id") Long id) {
		bookService.delete(id);
		return "redirect:/books";
	}
}
