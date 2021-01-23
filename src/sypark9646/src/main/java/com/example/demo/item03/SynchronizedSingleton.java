package com.example.demo.item03;

public class SynchronizedSingleton {

	private static SynchronizedSingleton instance;

	private SynchronizedSingleton() {
		if (instance != null) {
			throw new InstantiationError("Creating of this object is not allowed.");
		}
	}

	public static synchronized SynchronizedSingleton getInstance() {
		if (instance == null) {
			instance = new SynchronizedSingleton();
		}
		return instance;
	}
}
