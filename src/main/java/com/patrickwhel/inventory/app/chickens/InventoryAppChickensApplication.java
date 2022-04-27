package com.patrickwhel.inventory.app.chickens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;





@SpringBootApplication
@EnableDiscoveryClient


public class InventoryAppChickensApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryAppChickensApplication.class, args);
	}

}
