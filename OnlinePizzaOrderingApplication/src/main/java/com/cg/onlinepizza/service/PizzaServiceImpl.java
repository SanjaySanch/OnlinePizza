package com.cg.onlinepizza.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.onlinepizza.exceptions.InvalidMinCostMaxCostException;
import com.cg.onlinepizza.exceptions.PizzaIdNotFoundException;
import com.cg.onlinepizza.model.Pizza;
import com.cg.onlinepizza.repository.IPizzaRepository;

@Service
@Transactional
public class PizzaServiceImpl implements IPizzaService {
	@Autowired // injecting dependent objects
	private IPizzaRepository dao;

	// Adding Pizza
	public Pizza addPizza(Pizza pizza) {
		dao.save(pizza);
		return pizza;
	}

	public Pizza updatePizza(Pizza piz) {
		
		return dao.save(piz);
	}

	public Pizza deletePizza(int pizzaId) {
		Pizza piz = null;
		dao.deleteById(pizzaId);
		return piz;
	}

	public List<Pizza> viewPizzaAllList() {

		List<Pizza> pizzaList = dao.findAll();
		dao.findAll();
		return pizzaList;
	}

	public List<Pizza> viewPizza(String pizzaType) {
		List<Pizza> pizzaList = dao.viewPizza(pizzaType);
		return pizzaList;
	}

	public Optional<Pizza> viewPizza(int pizzaId) throws PizzaIdNotFoundException {

		Optional<Pizza> pizz = dao.findById(pizzaId);
		if (pizz.isEmpty())
			throw new PizzaIdNotFoundException("     Enter a valid Pizza ID      ");
		else
			return pizz;
	}

	public List<Pizza> viewPizzaList(double minCost, double maxCost) throws InvalidMinCostMaxCostException {

		List<Pizza> pizz = dao.viewPizzaList(minCost, maxCost);
		if (pizz.isEmpty())
			throw new InvalidMinCostMaxCostException("   Enter valid MinCost and MaxCost   ");
		else
			return pizz;
	}

}
