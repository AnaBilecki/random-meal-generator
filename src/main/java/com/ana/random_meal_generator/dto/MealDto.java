package com.ana.random_meal_generator.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class MealDto {

	@JsonAlias("strMeal")
	private String name;
	
	@JsonAlias("strInstructions")
	private String instructions;
	
	private List<String> ingredients = new ArrayList<String>();
	
	@JsonAnySetter
	private void addIngredient(String key, Object value) {
		if (key.contains("strIngredient")) {
			String ingredient = (String) value;
			if (ingredient.isBlank()) {
				return;
			}
			log.debug("Adding new ingredient {} with value {} to list", key, ingredient);
			ingredients.add(value.toString());
		}
	}
}
