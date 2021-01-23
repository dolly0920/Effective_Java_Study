package com.example.demo.item03;

public class LazyInitializationSingleton {

	private static LazyInitializationSingleton instance;

	private LazyInitializationSingleton() {
		if (instance != null) {
			throw new InstantiationError("Creating of this object is not allowed.");
		}
	}

	public static LazyInitializationSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializationSingleton();
		}
		return instance;
	}
}
