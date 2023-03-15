package com.jessicapetrey.save_travels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jessicapetrey.save_travels.models.Expense;



@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>{
 List<Expense> findAll();
}
