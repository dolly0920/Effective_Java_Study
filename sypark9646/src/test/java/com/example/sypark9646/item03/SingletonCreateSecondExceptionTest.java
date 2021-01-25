package com.example.demo.item03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonCreateSecondExceptionTest {

	@Test
	public void testEagerInitializationSingletonException() throws IllegalAccessException, InvocationTargetException, InstantiationException {
		Constructor<?>[] constructors = EagerInitializationSingleton.class.getDeclaredConstructors();
		Constructor theConstructor = constructors[0];
		theConstructor.setAccessible(true);
		EagerInitializationSingleton singleton1 = (EagerInitializationSingleton) theConstructor.newInstance();
		EagerInitializationSingleton singleton2 = (EagerInitializationSingleton) theConstructor.newInstance();

		System.out.println(singleton1);
		System.out.println(singleton2);

		Assertions.assertSame(singleton1, singleton2);
	}
}
