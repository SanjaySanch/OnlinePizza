package com.cg.onlinepizza.service;

import java.util.List;
import java.util.Optional;

import com.cg.onlinepizza.exceptions.InvalidMinCostMaxCostException;
import com.cg.onlinepizza.exceptions.PizzaIdNotFoundException;
import com.cg.onlinepizza.model.Pizza;

public interface IPizzaService {

	Pizza addPizza(Pizza pizza);

	Pizza updatePizza(Pizza pizza);

	Pizza deletePizza(int pizza);

	List<Pizza> viewPizzaAllList();

	Optional<Pizza>  viewPizza(int pizzaId) throws PizzaIdNotFoundException;

	List<Pizza> viewPizzaList(double minCost, double maxCost)throws InvalidMinCostMaxCostException ;

	List<Pizza> viewPizza(String pizzaType);

}
