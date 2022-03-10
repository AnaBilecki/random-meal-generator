package com.ana.random_meal_generator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ana.random_meal_generator.clients.TheMealDbClient;
import com.ana.random_meal_generator.dto.MealsDto;
import com.ana.random_meal_generator.exceptions.IntegrationException;

import feign.FeignException;

@Service
public class MealServiceImpl implements MealService {

	@Autowired
	private TheMealDbClient client;
	
	@Override
	public MealsDto getRandomMeal() {
		try {
			return client.getRandomMeal();
		} catch (FeignException e) {
			throw new IntegrationException(e);
		}
	}
}
