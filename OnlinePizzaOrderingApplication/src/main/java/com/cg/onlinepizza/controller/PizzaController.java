package com.cg.onlinepizza.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cg.onlinepizza.model.Pizza;
import com.cg.onlinepizza.service.PizzaServiceImpl;

@RestController
@RequestMapping("/pizza")
public class PizzaController {
	@Autowired
	PizzaServiceImpl service;

	@PostMapping("/addPizza")
	public String addpizzas(@RequestBody Pizza pizza) {
		service.addPizza(pizza);
		return "added";
	}

	@GetMapping("/allPizza")
	public List<Pizza> allPizza() {

		return service.viewPizzaAllList();

	}

	@DeleteMapping("/removePizza/{id}")
	public String remove(@PathVariable Integer id) {
		service.deletePizza(id);
		return "Moving to trash... Deleted";
	}

	@PutMapping("/updatePizza")
	public String update(@RequestBody Pizza pizza) {
		service.updatePizza(pizza);
		return "Updated";
	}

	@GetMapping("/allPizzadisplayByType/{pizzname}")
	public List<Pizza> allByType(@PathVariable String pizzname) {
		return service.viewPizza(pizzname);

	}

	@GetMapping("/findById/{id}")
	public Optional<Pizza> findById(@PathVariable Integer id)  {
		return service.viewPizza(id);

	}

	@GetMapping("/betweenCost/{c1}/{c2}")
	public List<Pizza> pizzaBTWcost(@PathVariable Integer c1, @PathVariable Integer c2)
			 {
		return service.viewPizzaList(c1, c2);
	}

}
