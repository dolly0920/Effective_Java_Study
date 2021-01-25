package com.example.sypark9646.item02.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class NutritionFactsJavaBeansPattern {

	private static NutritionFactsJavaBeansPattern NUTRITION_FACTS = new NutritionFactsJavaBeansPattern();

	public static NutritionFactsJavaBeansPattern getInstance() {
		return NUTRITION_FACTS;
	}

	private int servingSize = -1;
	private int servings = -1;
	private int calories;
	private int fat;
	private int sodium;
	private int carbohydrate;


}
