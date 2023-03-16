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

//	get one
	public Dojo getOne(Long id) {
		Optional<Dojo> Dojo = dojoRepo.findById(id);
		return Dojo.isPresent() ? Dojo.get() : null;
	}

	// create
	public Dojo create(Dojo Dojo) {
		return dojoRepo.save(Dojo);
	}

	// update
	public Dojo update(Dojo Dojo) {
		return dojoRepo.save(Dojo);
	}

	// delete
	public void delete(Long id) {
		dojoRepo.deleteById(id);
	}
}
