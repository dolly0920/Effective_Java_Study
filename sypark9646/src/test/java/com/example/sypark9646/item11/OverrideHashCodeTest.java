package com.example.sypark9646.item11;


import java.util.HashSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OverrideHashCodeTest {

		@Test
		@DisplayName("인터페이스 확장 객체 hashcode 테스트")
		public void testInterfaceExtensionClass() {
				HashSet<Animal> animals = new HashSet<>();
				animals.add(new Cat("white"));
				animals.add(new Cat("white")); // true
				animals.add(new Dog("white")); // false
				animals.add(new Cat("black")); // false

				Assertions.assertEquals(3, animals.size());
		}

		@Test
		@DisplayName("컴포지션 객체 hashcode 테스트")
		public void testCompositionClass() {
				HashSet<Shape> shapes = new HashSet<>();
				shapes.add(new Shape(1, 2));
				shapes.add(new Shape(1, 2));

				Assertions.assertEquals(1, shapes.size());
		}
}
