package com.patrickwhel.inventory.app.chickens.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patrickwhel.inventory.app.chickens.data.ChickenEntity;
import com.patrickwhel.inventory.app.chickens.data.ChickensRepository;
import com.patrickwhel.inventory.app.chickens.shared.ChickenDTO;

@Service
public class ChickenServiceImplement implements ChickensService {
	
	
	ChickensRepository chickensRepository;
	
	@Autowired
	public ChickenServiceImplement(ChickensRepository chickensRepository) 
	{
		this.chickensRepository = chickensRepository;
		
		
	}


	@Override
	public ChickenDTO createChicken(ChickenDTO chickenDetails) {
		// TODO Auto-generated method stub

		chickenDetails.setChickenId(UUID.randomUUID().toString());
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		ChickenEntity chickenEntity = modelMapper.map(chickenDetails, ChickenEntity.class);
		
		
		chickensRepository.save(chickenEntity);
	
		return null;
	}


	@Override
	public ChickenDTO getChickenByChickenId(String chickenId) {
		// TODO Auto-generated method stub
		return null;
	}

}
