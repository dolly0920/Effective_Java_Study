package com.example.sypark9646.item01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConstructorFactoryTest {

	@Test
	@DisplayName("factory pattern 테스트")
	public void testFactoryPattern() throws InterruptedException {
		CreateShapeFromNameFactory shapeFromNameFactory = new CreateShapeFromNameFactory();
		Shape shape1 = shapeFromNameFactory.createShape("circle");
		Shape shape2 = shapeFromNameFactory.createShape("circle");
		Shape shape3 = shapeFromNameFactory.createShape("rectangle");

		System.out.println(shape1.getName());
		System.out.println(shape2.getName());
		System.out.println(shape3.getName());
		Assertions.assertEquals(shape1.getName(), shape2.getName());
	}

	@Test
	@DisplayName("reflection 테스트")
	public void testReflectionPattern() throws InterruptedException {
		CreateShapeReflectionFactory shapeFromNameFactory = new CreateShapeReflectionFactory();
		Shape shape1 = shapeFromNameFactory.createShape("com.example.sypark9646.item01.Circle");
		Shape shape2 = shapeFromNameFactory.createShape("com.example.sypark9646.item01.Circle");
		Shape shape3 = shapeFromNameFactory.createShape("com.example.sypark9646.item01.Rectangle");

		System.out.println(shape1.getName());
		System.out.println(shape2.getName());
		System.out.println(shape3.getName());
		Assertions.assertEquals(shape1.getName(), shape2.getName());
	}

	@Test
	@DisplayName("constructor 테스트")
	public void testConstructorPattern() throws InterruptedException {
		Shape shape1 = new Circle();
		Shape shape2 = new Circle();
		Shape shape3 = new Rectangle();

		System.out.println(shape1.getName());
		System.out.println(shape2.getName());
		System.out.println(shape3.getName());
		Assertions.assertEquals(shape1.getName(), shape2.getName());
	}
}
