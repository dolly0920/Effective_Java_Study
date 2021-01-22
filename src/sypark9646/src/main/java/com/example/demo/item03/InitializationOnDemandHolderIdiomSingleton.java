package com.example.demo.item03;

public class InitializationOnDemandHolderIdiomSingleton {

	private InitializationOnDemandHolderIdiomSingleton() {
	}

	public static InitializationOnDemandHolderIdiomSingleton getInstance() {
		return SingletonLazyHolder.INSTANCE;
	}

	private static class SingletonLazyHolder {

		private static final InitializationOnDemandHolderIdiomSingleton INSTANCE = new InitializationOnDemandHolderIdiomSingleton();
	}
}
