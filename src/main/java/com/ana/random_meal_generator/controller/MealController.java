package com.ana.random_meal_generator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ana.random_meal_generator.dto.MealsDto;
import com.ana.random_meal_generator.services.MealServiceImpl;

@RestController
public class MealController {

	@Autowired
	private MealServiceImpl service;
	
	@GetMapping("/meal")
	public MealsDto getRandomMeal() {
		return service.getRandomMeal();
	}
}
