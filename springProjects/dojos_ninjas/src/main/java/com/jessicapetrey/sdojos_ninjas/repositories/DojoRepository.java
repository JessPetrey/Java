package com.jessicapetrey.sdojos_ninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jessicapetrey.sdojos_ninjas.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>{

}
