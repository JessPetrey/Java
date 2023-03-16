package com.jessicapetrey.sdojos_ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jessicapetrey.sdojos_ninjas.models.Dojo;
import com.jessicapetrey.sdojos_ninjas.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepo;

	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}

//	get all 
	public List<Dojo> findAll() {
		return (List<Dojo>) dojoRepo.findAll();
	}

//	get one by id
	public Dojo getOne(Long id) {
		Optional<Dojo> potentialDojo = dojoRepo.findById(id);
		return potentialDojo.isPresent() ? potentialDojo.get() : null;
	}
	
//	get one by name
	public Dojo getOne(String name) {
		Optional<Dojo> potentialDojo = dojoRepo.findByName(name);
		return potentialDojo.isPresent() ? potentialDojo.get() : null;
	}

	// create
	public Dojo create(Dojo Dojo) {
		return dojoRepo.save(Dojo);
	}

}
