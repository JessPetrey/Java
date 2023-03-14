package com.jessicapetrey.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jessicapetrey.mvc.models.Book;
import com.jessicapetrey.mvc.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepo; //add repo as a dependency
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	
	public List<Book> allBooks() { return bookRepo.findAll(); } // gets all books
	
	public Book createBook(Book newBook) { return bookRepo.save(newBook); } // makes a new book
	
	
	//finds a specific book - 
	public Book findBook(Long id) {
		// creates an optional object that may or may not contain the book searched for
		Optional<Book> optionalBook = bookRepo.findById(id);
		
		// checks if the searched for book exists in the object
		if(optionalBook.isPresent()) {
			return optionalBook.get(); // yes? return the book
		} else {
			return null;
		}
	}
	
}