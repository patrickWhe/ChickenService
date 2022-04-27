package com.patrickwhel.inventory.app.chickens.service;

import com.patrickwhel.inventory.app.chickens.shared.ChickenDTO;


public interface ChickensService {
	ChickenDTO createChicken(ChickenDTO chickenDeatails);
	ChickenDTO getChickenByChickenId(String chickenId);
	
	

}
