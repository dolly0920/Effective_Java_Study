package com.example.sypark9646.item03;

import java.io.Serializable;

public class InitializationOnDemandHolderIdiomSingleton implements Serializable {

	private InitializationOnDemandHolderIdiomSingleton() {
		if (getInstance() != null) {
			throw new InstantiationError("Creating of this object is not allowed.");
		}
	}

	public static InitializationOnDemandHolderIdiomSingleton getInstance() {
		return SingletonLazyHolder.INSTANCE;
	}

	private static class SingletonLazyHolder {

		private static final InitializationOnDemandHolderIdiomSingleton INSTANCE = new InitializationOnDemandHolderIdiomSingleton();
	}

	protected Object readResolve() {
		return getInstance();
	}
}
