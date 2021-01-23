package com.example.demo.item03;

public class EagerInitializationSingleton {

	private static EagerInitializationSingleton instance = new EagerInitializationSingleton();

	private EagerInitializationSingleton() {
		if (instance != null) {
			throw new InstantiationError("Creating of this object is not allowed.");
		}
	}

	public static EagerInitializationSingleton getInstance() {
		return instance;
	}
}
