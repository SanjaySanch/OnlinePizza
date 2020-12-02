package com.cg.onlinepizza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.onlinepizza.exceptions.InvalidMinCostMaxCostException;
import com.cg.onlinepizza.model.Pizza;

public interface IPizzaRepository extends JpaRepository<Pizza, Integer>{
    @Query("select p from Pizza p where p.pizzaType=?1")
	List<Pizza> viewPizza(String pizzaType);	
    @Query("select p from Pizza p where p.pizzaCost between ?1 and ?2")
    List<Pizza> viewPizzaList(double minCost, double maxCost)throws InvalidMinCostMaxCostException ;
}
