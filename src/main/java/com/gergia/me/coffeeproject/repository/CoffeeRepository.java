package com.gergia.me.coffeeproject.repository;

import com.gergia.me.coffeeproject.model.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {}
