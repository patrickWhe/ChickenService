package com.patrickwhel.inventory.app.chickens.ui.controllers;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.patrickwhel.inventory.app.chickens.service.ChickensService;
import com.patrickwhel.inventory.app.chickens.shared.ChickenDTO;
import com.patrickwhel.inventory.app.chickens.ui.model.CreateChickenRequestModel;



@SpringBootApplication
@RestController

@RequestMapping("/chickens")
public class ChickensController {
	
	@Autowired
private Environment env; // access port number

	@Autowired
	ChickensService chickensService;
	
	@GetMapping("/status/check")
	public String status()	
	{
		
		return "Working on port" + env.getProperty("local.server.port");
	}
	
	
	
	@PostMapping(
			consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE },
			produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }
			)
	public ResponseEntity<CreateChickenRequestModel> createChicken(@RequestBody CreateChickenRequestModel chickenDetails)
	{
		ModelMapper modelMapper = new ModelMapper(); 
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		ChickenDTO chickenDTO = modelMapper.map(chickenDetails, ChickenDTO.class);
		
		ChickenDTO createdChicken = chickensService.createChicken(chickenDTO);
		
		CreateChickenRequestModel returnValue = modelMapper.map(createdChicken, CreateChickenRequestModel.class);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
	}
	
    @GetMapping(value="/{chickenId}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<CreateChickenRequestModel> getChicken(@PathVariable("chickenId") String chickenId) {
       
        ChickenDTO chickenDTO = chickensService.getChickenByChickenId(chickenId); 
        CreateChickenRequestModel returnValue = new ModelMapper().map(chickenDTO, CreateChickenRequestModel.class);
        
        return ResponseEntity.status(HttpStatus.OK).body(returnValue);
    }

}
