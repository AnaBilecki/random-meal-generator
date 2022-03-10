package com.ana.random_meal_generator.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ana.random_meal_generator.dto.MealsDto;

@FeignClient(value = "theMealDbClient", url = "https://www.themealdb.com/api/json/v1/1/random.php")
public interface TheMealDbClient {

	@RequestMapping(method = RequestMethod.GET, value = "/meal")
	MealsDto getRandomMeal();
}
