package com.example.demo.item03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonSerializeTests {

	@Test
	public void testEagerInitializationSingleton() throws IOException, ClassNotFoundException {
		EagerInitializationSingleton singleton1 = EagerInitializationSingleton.getInstance();
		ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("filename1.ser"));
		obs.writeObject(singleton1);
		obs.close();

		ObjectInputStream objInputStream = new ObjectInputStream(new FileInputStream("filename1.ser"));
		EagerInitializationSingleton singleton2 = (EagerInitializationSingleton) objInputStream.readObject();
		objInputStream.close();

		Assertions.assertSame(singleton1.getClass(), singleton2.getClass()); // true
		Assertions.assertSame(singleton1, singleton2); // true
		Assertions.assertSame(singleton1.hashCode(), singleton2.hashCode()); // false
	}
}
