package com.example.sypark9646.item04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AbstractClassInterfaceTest {
	@Test
	@DisplayName("추상클래스 인터페이스 테스트")
	public void testConcreteClass() throws InterruptedException {
		Dog dog = new Dog();
		dog.jump();
		dog.makeNoise();
	}
}
