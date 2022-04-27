package com.patrickwhel.inventory.app.chickens.data;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("null")
public interface ChickensServiceClient {
	
	@GetMapping("/chickens/{id}")
	public void getChickens(@PathVariable String Id);
	

}
