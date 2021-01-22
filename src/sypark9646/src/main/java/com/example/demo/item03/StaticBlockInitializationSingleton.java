package com.example.demo.item03;

public class StaticBlockInitializationSingleton {

	private static StaticBlockInitializationSingleton instance;

	private StaticBlockInitializationSingleton() {
	}

	static {
		try {
			instance = new StaticBlockInitializationSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception creating instance.");
		}
	}

	public static StaticBlockInitializationSingleton getInstance() {
		return instance;
	}
}
