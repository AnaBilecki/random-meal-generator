package com.ana.random_meal_generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RandomMealGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomMealGeneratorApplication.class, args);
	}

}
