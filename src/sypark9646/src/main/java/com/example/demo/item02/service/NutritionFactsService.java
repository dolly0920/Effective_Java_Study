package com.example.demo.item02.service;

import com.example.demo.item02.model.NutritionFactsJavaBeansPattern;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NutritionFactsService {

	public static boolean printJavaBeans() {
		NutritionFactsJavaBeansPattern nutritionFacts = NutritionFactsJavaBeansPattern.getInstance();

		int random = (int) (Math.random() * 1000);
		nutritionFacts.setServingSize(random);
		nutritionFacts.setServings(random);
		nutritionFacts.setCalories(random);
		nutritionFacts.setSodium(random);
		nutritionFacts.setFat(random);
		nutritionFacts.setCarbohydrate(random);

		if (nutritionFacts.getServingSize() == nutritionFacts.getServings() &&
				nutritionFacts.getServingSize() == nutritionFacts.getCalories() &&
				nutritionFacts.getServingSize() == nutritionFacts.getSodium() &&
				nutritionFacts.getServingSize() == nutritionFacts.getFat() &&
				nutritionFacts.getServingSize() == nutritionFacts.getCarbohydrate()) {
			return true;
		}

		log.info(nutritionFacts + " " + nutritionFacts.hashCode());
		return false;
	}
}
