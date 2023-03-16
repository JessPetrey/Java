package com.jessicapetrey.sdojos_ninjas.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jessicapetrey.sdojos_ninjas.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>{
	Optional<Dojo> findByName(String name);
	List<Dojo> findAll();
}
