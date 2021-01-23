package com.example.demo.item03;

public class InitializationOnDemandHolderIdiomSingleton {

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
}
