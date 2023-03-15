package com.jessicapetrey.all_books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jessicapetrey.all_books.models.Book;
import com.jessicapetrey.all_books.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public String index(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("allBooks", books);
		return "/books/index.jsp";
	}
	
	
	@GetMapping("/books/{bookId}")
	public String show(Model model, @PathVariable("bookId")Long bookId) {		
		Book book = bookService.findOneBook(bookId);
		model.addAttribute("book", book);
		return "/books/show.jsp";
	}
}
