package com.example.sypark9646.item03;

import java.io.Serializable;

public class StaticBlockInitializationSingleton implements Serializable {

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

	protected Object readResolve() {
		return instance;
	}
}
