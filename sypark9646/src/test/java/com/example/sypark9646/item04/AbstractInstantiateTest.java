package com.example.sypark9646.item04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AbstractInstantiateTest {

	@Test
	@DisplayName("추상클래스 인스턴스화 테스트")
	public void testInstantiateShape() throws InterruptedException {
		Shape circle = new Circle();
		Shape rectangle = new Rectangle();

		circle.drawCenter();
		rectangle.drawCenter();
	}
}
