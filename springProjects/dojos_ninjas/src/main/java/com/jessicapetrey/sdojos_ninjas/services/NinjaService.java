package com.jessicapetrey.sdojos_ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jessicapetrey.sdojos_ninjas.models.Ninja;
import com.jessicapetrey.sdojos_ninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepo;
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
//	get all 
	public List<Ninja> findAll(){
		return (List<Ninja>) ninjaRepo.findAll();
	}
	
//	get one
	public Ninja getOne(Long id) {
		Optional<Ninja> ninja = ninjaRepo.findById(id);
		return ninja.isPresent() ? ninja.get() : null;
	}
	
	//create
	public Ninja create(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	//update
	public Ninja update(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	//delete 
	public void delete(Long id) {
		ninjaRepo.deleteById(id);
	}
}
