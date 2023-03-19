package com.jessicapetrey.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jessicapetrey.bookclub.models.Book;
import com.jessicapetrey.bookclub.repositories.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepo; // add repo as a dependency

	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	// find all
	public List<Book> getAll() {
		return bookRepo.findAll();
	} 


	// find one by id
	public Book getOne(Long id) {
		Optional<Book> book = bookRepo.findById(id);
		return book.isPresent() ? book.get() : null;
	}
	
	public Book create(Book newBook) {
		return bookRepo.save(newBook);
	} 

	public Book update(Book updatedBook) {
			return bookRepo.save(updatedBook);
	}
	
	public void delete(Long id) {
		bookRepo.deleteById(id);
	}


}
