package com.example.demo.item03;

public class StaticBlockInitializationSingleton {

	private static StaticBlockInitializationSingleton instance;

	private StaticBlockInitializationSingleton() {
		if (instance != null) {
			throw new InstantiationError("Creating of this object is not allowed.");
		}
	}

	static {
		try {
			instance = new StaticBlockInitializationSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Creating of this object is not allowed.");
		}
	}

	public static StaticBlockInitializationSingleton getInstance() {
		return instance;
	}
}
