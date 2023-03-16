package com.jessicapetrey.sdojos_ninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jessicapetrey.sdojos_ninjas.models.Ninja;
import com.jessicapetrey.sdojos_ninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepo;
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public List<Ninja> findAll(){
		return ninjaRepo.findAll();
	}
}
