package com.example.sypark9646.item02.service;

import com.example.sypark9646.item02.model.NutritionFactsBuilderPattern;
import com.example.sypark9646.item02.model.NutritionFactsConstructorPattern;
import com.example.sypark9646.item02.model.NutritionFactsJavaBeansPattern;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NutritionFactsService {

	public static boolean printConstructor() {
		int random = (int) (Math.random() * 1000);

		NutritionFactsConstructorPattern nutritionFacts = new NutritionFactsConstructorPattern(random, random, random, random, random, random);

		return (nutritionFacts.getServingSize() == nutritionFacts.getServings() &&
				nutritionFacts.getServingSize() == nutritionFacts.getCalories() &&
				nutritionFacts.getServingSize() == nutritionFacts.getSodium() &&
				nutritionFacts.getServingSize() == nutritionFacts.getFat() &&
				nutritionFacts.getServingSize() == nutritionFacts.getCarbohydrate());
	}

	public static boolean printJavaBeans() {
		NutritionFactsJavaBeansPattern nutritionFacts = NutritionFactsJavaBeansPattern.getInstance();

		int random = (int) (Math.random() * 1000);
		nutritionFacts.setServingSize(random);
		nutritionFacts.setServings(random);
		nutritionFacts.setCalories(random);
		nutritionFacts.setSodium(random);
		nutritionFacts.setFat(random);
		nutritionFacts.setCarbohydrate(random);

		return (nutritionFacts.getServingSize() == nutritionFacts.getServings() &&
				nutritionFacts.getServingSize() == nutritionFacts.getCalories() &&
				nutritionFacts.getServingSize() == nutritionFacts.getSodium() &&
				nutritionFacts.getServingSize() == nutritionFacts.getFat() &&
				nutritionFacts.getServingSize() == nutritionFacts.getCarbohydrate());
	}

	public static boolean printBuilder() {
		int random = (int) (Math.random() * 1000);
		NutritionFactsBuilderPattern nutritionFacts = new NutritionFactsBuilderPattern.Builder(random, random)
				.setCalories(random)
				.setSodium(random)
				.setFat(random)
				.setCarbohydrate(random)
				.build();

		return (nutritionFacts.getServingSize() == nutritionFacts.getServings() &&
				nutritionFacts.getServingSize() == nutritionFacts.getCalories() &&
				nutritionFacts.getServingSize() == nutritionFacts.getSodium() &&
				nutritionFacts.getServingSize() == nutritionFacts.getFat() &&
				nutritionFacts.getServingSize() == nutritionFacts.getCarbohydrate());
	}
}
