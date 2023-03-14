package com.jessicapetrey.rendering_books.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jessicapetrey.rendering_books.models.Book;
import com.jessicapetrey.rendering_books.services.BookService;

@RestController
public class BooksApi {
	private final BookService bookService;

	public BooksApi(BookService bookService) {
		this.bookService = bookService;
	}

	// get all
	@RequestMapping("/api/books")
	public List<Book> index() {
		return bookService.allBooks();
	}

	// create
	@PostMapping("/api/books")
	public Book create(@RequestParam(value = "title") String title,
			@RequestParam(value = "description") String description,
			@RequestParam(value = "language") String language,
			@RequestParam(value = "numOfPages") Integer numOfPages) {
		Book book = new Book(title, description, language, numOfPages);
		return bookService.createBook(book);
	}

	// get one by id
	@GetMapping("/api/books/{id}")
	public Book showOne(@PathVariable("id") Long id) {
		Book book = bookService.findOneBook(id);
		return book;
	}

	// update one by id
	@PutMapping("/api/books/{id}")
	public Book updateOne(@PathVariable("id") Long id, 
			@RequestParam(value = "title") String title,
			@RequestParam(value = "description") String description, 
			@RequestParam(value = "language") String language,
			@RequestParam(value = "numOfPages") Integer numOfPages) {
		Book updatedBook = bookService.findOneBook(id);
		updatedBook.setTitle(title);
		updatedBook.setDescription(description);
		updatedBook.setLanguage(language);
		updatedBook.setNumberOfPages(numOfPages);
		return bookService.updateBook(updatedBook);
	}


	@DeleteMapping(value = "/api/books/{id}")
	public void deleteOne(@PathVariable("id") Long id) {
		bookService.deleteOneBook(id);
	}

}
