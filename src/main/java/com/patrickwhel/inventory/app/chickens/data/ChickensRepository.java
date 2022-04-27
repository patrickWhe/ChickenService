package com.patrickwhel.inventory.app.chickens.data;

import org.springframework.data.repository.CrudRepository;

public interface ChickensRepository extends CrudRepository<ChickenEntity, Long> {

}
