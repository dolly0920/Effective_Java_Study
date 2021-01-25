package com.example.sypark9646.item03;

import java.io.Serializable;

public class LazyInitializationSingleton implements Serializable {

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

	protected Object readResolve() {
		return instance;
	}
}
