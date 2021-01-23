package com.example.demo.item03;

public class DoubleCheckingLockingSingleton {

	private static DoubleCheckingLockingSingleton instance;

	private DoubleCheckingLockingSingleton() {
		if (instance != null) {
			throw new InstantiationError("Creating of this object is not allowed.");
		}
	}

	public static DoubleCheckingLockingSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckingLockingSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckingLockingSingleton();
				}
			}
		}
		return instance;
	}

}
