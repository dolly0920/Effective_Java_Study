package com.example.sypark9646.item5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class AnimalFactory {

	private static final Map<AnimalType, Supplier<? extends Animal>> map = new HashMap<>();

	static {
		map.put(AnimalType.CAT, Cat::new);
		map.put(AnimalType.DOG, Dog::new);
	}

	private AnimalFactory() throws Exception {
		throw new Exception("factory instance 생성 금지");
	}

	public static Animal getAnimal(AnimalType animalType) {
		Supplier<? extends Animal> animal = map.get(animalType);
		return animal.get();
	}
}
