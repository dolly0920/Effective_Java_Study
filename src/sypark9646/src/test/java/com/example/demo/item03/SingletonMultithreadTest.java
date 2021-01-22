package com.example.demo.item03;

import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonMultithreadTest {

	@Test
	public void testDoubleCheckingLockingSingleton() throws InterruptedException {
		int numberOfThreads = 500;
		ExecutorService service = Executors.newFixedThreadPool(500);
		CountDownLatch latch = new CountDownLatch(numberOfThreads);

		HashSet<DoubleCheckingLockingSingleton> singletonHashSet = new HashSet<>();
		singletonHashSet.add(DoubleCheckingLockingSingleton.getInstance());

		for (int i = 0; i < numberOfThreads; i++) {
			service.execute(() -> {
				Assertions.assertTrue(singletonHashSet.contains(DoubleCheckingLockingSingleton.getInstance()));
				singletonHashSet.add(DoubleCheckingLockingSingleton.getInstance());
				latch.countDown();
			});
		}
		Assertions.assertEquals(singletonHashSet.size(), 1);
		latch.await();
	}

	@Test
	public void testEagerInitializationSingleton() throws InterruptedException {
		int numberOfThreads = 500;
		ExecutorService service = Executors.newFixedThreadPool(500);
		CountDownLatch latch = new CountDownLatch(numberOfThreads);

		HashSet<EagerInitializationSingleton> singletonHashSet = new HashSet<>();
		singletonHashSet.add(EagerInitializationSingleton.getInstance());

		for (int i = 0; i < numberOfThreads; i++) {
			service.execute(() -> {
				Assertions.assertTrue(singletonHashSet.contains(EagerInitializationSingleton.getInstance()));
				singletonHashSet.add(EagerInitializationSingleton.getInstance());
				latch.countDown();
			});
		}
		Assertions.assertEquals(singletonHashSet.size(), 1);
		latch.await();
	}

	@Test
	public void testEnumSingleton() throws InterruptedException {
		int numberOfThreads = 500;
		ExecutorService service = Executors.newFixedThreadPool(500);
		CountDownLatch latch = new CountDownLatch(numberOfThreads);

		HashSet<EnumSingleton> singletonHashSet = new HashSet<>();
		singletonHashSet.add(EnumSingleton.INSTANCE);

		for (int i = 0; i < numberOfThreads; i++) {
			service.execute(() -> {
				Assertions.assertTrue(singletonHashSet.contains(EnumSingleton.INSTANCE));
				singletonHashSet.add(EnumSingleton.INSTANCE);
				latch.countDown();
			});
		}
		Assertions.assertEquals(singletonHashSet.size(), 1);
		latch.await();
	}

	@Test
	public void testInitializationOnDemandHolderIdionSingleton() throws InterruptedException {
		int numberOfThreads = 500;
		ExecutorService service = Executors.newFixedThreadPool(500);
		CountDownLatch latch = new CountDownLatch(numberOfThreads);

		HashSet<InitializationOnDemandHolderIdiomSingleton> singletonHashSet = new HashSet<>();
		singletonHashSet.add(InitializationOnDemandHolderIdiomSingleton.getInstance());

		for (int i = 0; i < numberOfThreads; i++) {
			service.execute(() -> {
				Assertions.assertTrue(singletonHashSet.contains(InitializationOnDemandHolderIdiomSingleton.getInstance()));
				singletonHashSet.add(InitializationOnDemandHolderIdiomSingleton.getInstance());
				latch.countDown();
			});
		}
		Assertions.assertEquals(singletonHashSet.size(), 1);
		latch.await();
	}

	@Test
	public void testLazyInitializationSingleton() throws InterruptedException {
		int numberOfThreads = 500;
		ExecutorService service = Executors.newFixedThreadPool(500);
		CountDownLatch latch = new CountDownLatch(numberOfThreads);

		HashSet<LazyInitializationSingleton> singletonHashSet = new HashSet<>();
		singletonHashSet.add(LazyInitializationSingleton.getInstance());

		for (int i = 0; i < numberOfThreads; i++) {
			service.execute(() -> {
				Assertions.assertTrue(singletonHashSet.contains(LazyInitializationSingleton.getInstance()));
				singletonHashSet.add(LazyInitializationSingleton.getInstance());
				latch.countDown();
			});
		}
		Assertions.assertEquals(singletonHashSet.size(), 1);
		latch.await();
	}

	@Test
	public void testStaticBlockInitializationSingleton() throws InterruptedException {
		int numberOfThreads = 500;
		ExecutorService service = Executors.newFixedThreadPool(500);
		CountDownLatch latch = new CountDownLatch(numberOfThreads);

		HashSet<StaticBlockInitializationSingleton> singletonHashSet = new HashSet<>();
		singletonHashSet.add(StaticBlockInitializationSingleton.getInstance());

		for (int i = 0; i < numberOfThreads; i++) {
			service.execute(() -> {
				Assertions.assertTrue(singletonHashSet.contains(StaticBlockInitializationSingleton.getInstance()));
				singletonHashSet.add(StaticBlockInitializationSingleton.getInstance());
				latch.countDown();
			});
		}
		Assertions.assertEquals(singletonHashSet.size(), 1);
		latch.await();
	}

	@Test
	public void testSynchronizedSingleton() throws InterruptedException {
		int numberOfThreads = 500;
		ExecutorService service = Executors.newFixedThreadPool(500);
		CountDownLatch latch = new CountDownLatch(numberOfThreads);

		HashSet<SynchronizedSingleton> singletonHashSet = new HashSet<>();
		singletonHashSet.add(SynchronizedSingleton.getInstance());

		for (int i = 0; i < numberOfThreads; i++) {
			service.execute(() -> {
				Assertions.assertTrue(singletonHashSet.contains(SynchronizedSingleton.getInstance()));
				singletonHashSet.add(SynchronizedSingleton.getInstance());
				latch.countDown();
			});
		}
		Assertions.assertEquals(singletonHashSet.size(), 1);
		latch.await();
	}
}
