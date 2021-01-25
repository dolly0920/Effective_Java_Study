package com.example.demo.item03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

	@Test
	public void testDoubleCheckingLockingSingleton() throws InterruptedException {
		DoubleCheckingLockingSingleton singleton1 = DoubleCheckingLockingSingleton.getInstance();
		DoubleCheckingLockingSingleton singleton2 = DoubleCheckingLockingSingleton.getInstance();

		Assertions.assertSame(singleton1, singleton2);
	}

	@Test
	public void testEagerInitializationSingleton() throws InterruptedException {
		EagerInitializationSingleton singleton1 = EagerInitializationSingleton.getInstance();
		EagerInitializationSingleton singleton2 = EagerInitializationSingleton.getInstance();

		Assertions.assertSame(singleton1, singleton2);
	}

	@Test
	public void testEnumSingleton() throws InterruptedException {
		EnumSingleton singleton1 = EnumSingleton.INSTANCE;
		EnumSingleton singleton2 = EnumSingleton.INSTANCE;

		Assertions.assertSame(singleton1, singleton2);
	}

	@Test
	public void testInitializationOnDemandHolderIdionSingleton() throws InterruptedException {
		InitializationOnDemandHolderIdiomSingleton singleton1 = InitializationOnDemandHolderIdiomSingleton.getInstance();
		InitializationOnDemandHolderIdiomSingleton singleton2 = InitializationOnDemandHolderIdiomSingleton.getInstance();

		Assertions.assertSame(singleton1, singleton2);
	}

	@Test
	public void testLazyInitializationSingleton() throws InterruptedException {
		LazyInitializationSingleton singleton1 = LazyInitializationSingleton.getInstance();
		LazyInitializationSingleton singleton2 = LazyInitializationSingleton.getInstance();

		Assertions.assertSame(singleton1, singleton2);
	}

	@Test
	public void testStaticBlockInitializationSingleton() throws InterruptedException {
		StaticBlockInitializationSingleton singleton1 = StaticBlockInitializationSingleton.getInstance();
		StaticBlockInitializationSingleton singleton2 = StaticBlockInitializationSingleton.getInstance();

		Assertions.assertSame(singleton1, singleton2);
	}

	@Test
	public void testSynchronizedSingleton() throws InterruptedException {
		SynchronizedSingleton singleton1 = SynchronizedSingleton.getInstance();
		SynchronizedSingleton singleton2 = SynchronizedSingleton.getInstance();

		Assertions.assertSame(singleton1, singleton2);
	}
}
