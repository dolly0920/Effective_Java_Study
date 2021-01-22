package com.example.demo.item03;

public class DoubleCheckingLockingSingleton {

	private static DoubleCheckingLockingSingleton instance;

	private DoubleCheckingLockingSingleton() {
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
