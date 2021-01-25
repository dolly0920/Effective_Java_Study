package com.example.sypark9646.item03;

import java.io.Serializable;

public class EagerInitializationSingleton implements Serializable {

	private static EagerInitializationSingleton instance = new EagerInitializationSingleton();

	private EagerInitializationSingleton() {
		if (instance != null) {
			throw new InstantiationError("Creating of this object is not allowed.");
		}
	}

	public static EagerInitializationSingleton getInstance() {
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}
}
