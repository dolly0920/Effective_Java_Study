package com.example.sypark9646.item03;

import java.io.Serializable;

public class DoubleCheckingLockingSingleton implements Serializable {

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

	protected Object readResolve() {
		return instance;
	}
}
