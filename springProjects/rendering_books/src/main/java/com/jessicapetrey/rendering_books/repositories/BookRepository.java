package com.jessicapetrey.rendering_books.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jessicapetrey.rendering_books.models.Book;


public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findAll();
	
	List<Book> findByDescriptionContaining(String search);
	
	Long countByTitleContaining(String search);
	Long deleteByTitleContaining(String search);
}
