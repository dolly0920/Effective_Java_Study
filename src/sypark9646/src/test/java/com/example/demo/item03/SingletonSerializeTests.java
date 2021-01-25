package com.example.demo.item03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonSerializeTests {

	@Test
	public void testEagerInitializationSingleton() throws IOException, ClassNotFoundException {
		EagerInitializationSingleton singleton1 = EagerInitializationSingleton.getInstance();

		ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("eager_init.ser"));
		obs.writeObject(singleton1);
		obs.close();

		ObjectInputStream objInputStream = new ObjectInputStream(new FileInputStream("eager_init.ser"));
		EagerInitializationSingleton singleton2 = (EagerInitializationSingleton) objInputStream.readObject();
		objInputStream.close();

		Assertions.assertSame(singleton1.getClass(), singleton2.getClass()); // true
		Assertions.assertSame(singleton1, singleton2); // true
	}

	@Test
	public void testDoubleCheckingLockingSingleton() throws IOException, ClassNotFoundException {
		DoubleCheckingLockingSingleton singleton1 = DoubleCheckingLockingSingleton.getInstance();

		ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("double_checking.ser"));
		obs.writeObject(singleton1);
		obs.close();

		ObjectInputStream objInputStream = new ObjectInputStream(new FileInputStream("double_checking.ser"));
		DoubleCheckingLockingSingleton singleton2 = (DoubleCheckingLockingSingleton) objInputStream.readObject();
		objInputStream.close();

		Assertions.assertSame(singleton1.getClass(), singleton2.getClass()); // true
		Assertions.assertSame(singleton1, singleton2); // true
		System.out.println(singleton1.hashCode()+" "+singleton2.hashCode());
	}

	@Test
	public void testEnumSingleton() throws IOException, ClassNotFoundException {
		EnumSingleton singleton1 = EnumSingleton.INSTANCE;

		ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("enum.ser"));
		obs.writeObject(singleton1);
		obs.close();

		ObjectInputStream objInputStream = new ObjectInputStream(new FileInputStream("enum.ser"));
		EnumSingleton singleton2 = (EnumSingleton) objInputStream.readObject();
		objInputStream.close();

		Assertions.assertSame(singleton1.getClass(), singleton2.getClass()); // true
		Assertions.assertSame(singleton1, singleton2); // true
	}

	@Test
	public void testInitializationOnDemandHolderIdionSingleton() throws IOException, ClassNotFoundException {
		InitializationOnDemandHolderIdiomSingleton singleton1 = InitializationOnDemandHolderIdiomSingleton.getInstance();

		ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("holder.ser"));
		obs.writeObject(singleton1);
		obs.close();

		ObjectInputStream objInputStream = new ObjectInputStream(new FileInputStream("holder.ser"));
		InitializationOnDemandHolderIdiomSingleton singleton2 = (InitializationOnDemandHolderIdiomSingleton) objInputStream.readObject();
		objInputStream.close();

		Assertions.assertSame(singleton1.getClass(), singleton2.getClass()); // true
		Assertions.assertSame(singleton1, singleton2); // true
	}

	@Test
	public void testLazyInitializationSingleton() throws IOException, ClassNotFoundException {
		LazyInitializationSingleton singleton1 = LazyInitializationSingleton.getInstance();

		ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("lazy_init.ser"));
		obs.writeObject(singleton1);
		obs.close();

		ObjectInputStream objInputStream = new ObjectInputStream(new FileInputStream("lazy_init.ser"));
		LazyInitializationSingleton singleton2 = (LazyInitializationSingleton) objInputStream.readObject();
		objInputStream.close();

		Assertions.assertSame(singleton1.getClass(), singleton2.getClass()); // true
		Assertions.assertSame(singleton1, singleton2); // true
	}

	@Test
	public void testStaticBlockInitializationSingleton() throws IOException, ClassNotFoundException {
		StaticBlockInitializationSingleton singleton1 = StaticBlockInitializationSingleton.getInstance();

		ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("static_block.ser"));
		obs.writeObject(singleton1);
		obs.close();

		ObjectInputStream objInputStream = new ObjectInputStream(new FileInputStream("static_block.ser"));
		StaticBlockInitializationSingleton singleton2 = (StaticBlockInitializationSingleton) objInputStream.readObject();
		objInputStream.close();

		Assertions.assertSame(singleton1.getClass(), singleton2.getClass()); // true
		Assertions.assertSame(singleton1, singleton2); // true
	}

	@Test
	public void testSynchronizedSingleton() throws IOException, ClassNotFoundException {
		SynchronizedSingleton singleton1 = SynchronizedSingleton.getInstance();

		ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("synchronize.ser"));
		obs.writeObject(singleton1);
		obs.close();

		ObjectInputStream objInputStream = new ObjectInputStream(new FileInputStream("synchronize.ser"));
		SynchronizedSingleton singleton2 = (SynchronizedSingleton) objInputStream.readObject();
		objInputStream.close();

		Assertions.assertSame(singleton1.getClass(), singleton2.getClass()); // true
		Assertions.assertSame(singleton1, singleton2); // true
	}
}
