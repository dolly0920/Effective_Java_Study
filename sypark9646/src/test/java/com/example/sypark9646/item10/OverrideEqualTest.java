package com.example.sypark9646.item10;

import static org.junit.jupiter.api.Assertions.assertAll;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OverrideEqualTest {

		@Test
		@DisplayName("인터페이스 확장 객체 equals 테스트")
		public void testInterfaceExtensionClass() {
				Queue<Animal> animals = new LinkedList<>();
				animals.add(new Cat("white"));
				animals.add(new Cat("white")); // true
				animals.add(new Dog("white")); // false
				animals.add(new Cat("black")); // false

				Animal animal = animals.poll();
				while (!animals.isEmpty()) {
						Animal other = animals.poll();

						System.out.println(animal + " " + other + ": " + animal.equals(other) + " " + other.equals(animal));
				}
		}

		@Test
		@DisplayName("컴포지션 객체 equals 테스트")
		public void testCompositionClass() {
				Shape shape = new Shape(1, 2);
				Shape newShape = new Shape(1, 2);

				Circle circle = new Circle(1, 2, 3);
				Circle newCircle = new Circle(1, 2, 3);

				Rectangle rectangle = new Rectangle(1, 2, 1, 2);
				Rectangle newRectangle = new Rectangle(1, 2, 1, 2);

				assertAll(
						() -> Assertions.assertEquals(shape, circle), // false
						() -> Assertions.assertEquals(shape, rectangle), // false
						() -> Assertions.assertEquals(circle, rectangle), // false
						() -> Assertions.assertEquals(shape, newShape),
						() -> Assertions.assertEquals(circle, newCircle),
						() -> Assertions.assertEquals(rectangle, newRectangle)
				);
		}

		@Test
		@DisplayName("hashSet contains 테스트")
		public void testPutInterfaceExtensionClass() {
				HashSet<Animal> animals = new HashSet<>();
				animals.add(new Cat("white"));
				animals.add(new Cat("white")); // true
				animals.add(new Dog("white")); // false
				animals.add(new Cat("black")); // false

				Assertions.assertEquals(3, animals.size()); // false -> equals는 해시 함수와 관계 없다
		}
}
