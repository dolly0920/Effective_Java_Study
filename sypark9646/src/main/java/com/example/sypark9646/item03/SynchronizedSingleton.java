package com.example.sypark9646.item03;

import java.io.Serializable;

public class SynchronizedSingleton implements Serializable {

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

	protected Object readResolve() {
		return instance;
	}
}
