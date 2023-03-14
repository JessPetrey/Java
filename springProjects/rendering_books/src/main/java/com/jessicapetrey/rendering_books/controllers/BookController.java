package com.jessicapetrey.rendering_books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jessicapetrey.rendering_books.models.Book;
import com.jessicapetrey.rendering_books.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	
	@GetMapping("/books/{bookId}")
	public String index(Model model, @PathVariable("bookId")Long bookId) {
		System.out.println(bookId);
		
		Book book = bookService.findOneBook(bookId);
		model.addAttribute("book", book);
		return "index.jsp";
	}
}
