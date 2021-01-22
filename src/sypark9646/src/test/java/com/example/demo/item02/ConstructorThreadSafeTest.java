package com.example.demo.item02;

import com.example.demo.item02.service.NutritionFactsService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ConstructorThreadSafeTest {

	@Autowired
	private NutritionFactsService nutritionFactsService;

	@Test
	public void testConstructorPattern() throws InterruptedException {
		int numberOfThreads = 500;
		ExecutorService service = Executors.newFixedThreadPool(500);
		CountDownLatch latch = new CountDownLatch(numberOfThreads);

		for (int i = 0; i < numberOfThreads; i++) {
			service.execute(() -> {
				Assertions.assertTrue(NutritionFactsService.printConstructor());
				latch.countDown();
			});
		}
		latch.await();
	}

	@Test
	public void testJavaBeansPattern() throws InterruptedException {
		int numberOfThreads = 500;
		ExecutorService service = Executors.newFixedThreadPool(500);
		CountDownLatch latch = new CountDownLatch(numberOfThreads);

		for (int i = 0; i < numberOfThreads; i++) {
			service.execute(() -> {
				Assertions.assertTrue(NutritionFactsService.printJavaBeans());
				latch.countDown();
			});
		}
		latch.await();
	}

	@Test
	public void testBuilderPattern() throws InterruptedException {
		int numberOfThreads = 500;
		ExecutorService service = Executors.newFixedThreadPool(500);
		CountDownLatch latch = new CountDownLatch(numberOfThreads);

		for (int i = 0; i < numberOfThreads; i++) {
			service.execute(() -> {
				Assertions.assertTrue(NutritionFactsService.printBuilder());
				latch.countDown();
			});
		}
		latch.await();
	}
}
