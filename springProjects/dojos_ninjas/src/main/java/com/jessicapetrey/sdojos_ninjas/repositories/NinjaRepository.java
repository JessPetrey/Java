package com.jessicapetrey.sdojos_ninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jessicapetrey.sdojos_ninjas.models.Ninja;


@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
}