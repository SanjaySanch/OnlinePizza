package com.cg.onlinepizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlinepizza.model.PizzaOrder;

public interface IPizzaOrderRepository extends JpaRepository<PizzaOrder, Integer>{

	
}

