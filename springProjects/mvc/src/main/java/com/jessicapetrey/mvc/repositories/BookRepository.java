package com.jessicapetrey.mvc.repositories;
import com.jessicapetrey.mvc.models.Book;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findAll();
	
	List<Book> findByDescriptionContaining(String search);
	
	Long countByTitleContaining(String search);
	Long deleteByTitleContaining(String search);
}
