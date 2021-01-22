package com.example.demo.item03;

public class SynchronizedSingleton {

	private static SynchronizedSingleton instance;

	private SynchronizedSingleton() {
	}

	public static synchronized SynchronizedSingleton getInstance() {
		if (instance == null) {
			instance = new SynchronizedSingleton();
		}
		return instance;
	}
}
