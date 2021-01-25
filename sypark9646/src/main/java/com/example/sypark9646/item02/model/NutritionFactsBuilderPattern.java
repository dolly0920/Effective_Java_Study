package com.example.sypark9646.item02.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class NutritionFactsBuilderPattern {

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	private NutritionFactsBuilderPattern(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}

	public static class Builder {

		private final int servingSize;
		private final int servings;
		private int calories;
		private int fat;
		private int sodium;
		private int carbohydrate;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder setCalories(int calories) {
			this.calories = calories;
			return this;
		}

		public Builder setFat(int fat) {
			this.fat = fat;
			return this;
		}

		public Builder setSodium(int sodium) {
			this.sodium = sodium;
			return this;
		}

		public Builder setCarbohydrate(int carbohydrate) {
			this.carbohydrate = carbohydrate;
			return this;
		}

		public NutritionFactsBuilderPattern build() {
			return new NutritionFactsBuilderPattern(this);
		}
	}
}
