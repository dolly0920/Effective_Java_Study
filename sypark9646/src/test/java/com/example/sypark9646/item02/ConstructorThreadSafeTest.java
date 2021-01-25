package com.example.sypark9646.item02;

import com.example.sypark9646.item02.service.NutritionFactsService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ConstructorThreadSafeTest {

	@Autowired
	private NutritionFactsService nutritionFactsService;

	@Test
	@DisplayName("public constructor 멀티스레드 안전성 테스트 -> 멀티스레드에서 안전하다")
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
	@DisplayName("setter constructor 멀티스레드 안전성 테스트 -> 멀티스레드에서 안전하지 않다")
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
	@DisplayName("builder constructor 멀티스레드 안전성 테스트 -> 멀티스레드에서 안전하다")
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
