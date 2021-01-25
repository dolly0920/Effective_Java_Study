package com.example.sypark9646.item03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {

	@Test
	@DisplayName("singleton double checking locking 테스트")
	public void testDoubleCheckingLockingSingleton() throws InterruptedException {
		DoubleCheckingLockingSingleton singleton1 = DoubleCheckingLockingSingleton.getInstance();
		DoubleCheckingLockingSingleton singleton2 = DoubleCheckingLockingSingleton.getInstance();

		Assertions.assertSame(singleton1, singleton2);
	}

	@Test
	@DisplayName("singleton eager init 테스트")
	public void testEagerInitializationSingleton() throws InterruptedException {
		EagerInitializationSingleton singleton1 = EagerInitializationSingleton.getInstance();
		EagerInitializationSingleton singleton2 = EagerInitializationSingleton.getInstance();

		Assertions.assertSame(singleton1, singleton2);
	}

	@Test
	@DisplayName("singleton enum 테스트")
	public void testEnumSingleton() throws InterruptedException {
		EnumSingleton singleton1 = EnumSingleton.INSTANCE;
		EnumSingleton singleton2 = EnumSingleton.INSTANCE;

		Assertions.assertSame(singleton1, singleton2);
	}

	@Test
	@DisplayName("singleton holder 테스트")
	public void testInitializationOnDemandHolderIdionSingleton() throws InterruptedException {
		InitializationOnDemandHolderIdiomSingleton singleton1 = InitializationOnDemandHolderIdiomSingleton.getInstance();
		InitializationOnDemandHolderIdiomSingleton singleton2 = InitializationOnDemandHolderIdiomSingleton.getInstance();

		Assertions.assertSame(singleton1, singleton2);
	}

	@Test
	@DisplayName("singleton lazy init 테스트")
	public void testLazyInitializationSingleton() throws InterruptedException {
		LazyInitializationSingleton singleton1 = LazyInitializationSingleton.getInstance();
		LazyInitializationSingleton singleton2 = LazyInitializationSingleton.getInstance();

		Assertions.assertSame(singleton1, singleton2);
	}

	@Test
	@DisplayName("singleton static block 테스트")
	public void testStaticBlockInitializationSingleton() throws InterruptedException {
		StaticBlockInitializationSingleton singleton1 = StaticBlockInitializationSingleton.getInstance();
		StaticBlockInitializationSingleton singleton2 = StaticBlockInitializationSingleton.getInstance();

		Assertions.assertSame(singleton1, singleton2);
	}

	@Test
	@DisplayName("singleton synchronized 테스트")
	public void testSynchronizedSingleton() throws InterruptedException {
		SynchronizedSingleton singleton1 = SynchronizedSingleton.getInstance();
		SynchronizedSingleton singleton2 = SynchronizedSingleton.getInstance();

		Assertions.assertSame(singleton1, singleton2);
	}
}
