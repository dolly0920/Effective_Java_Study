package com.example.sypark9646.item07;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class HashMapTest {

		public static void main(String[] args) {
				MyKey k1 = new MyKey("Hello");
				MyKey k2 = new MyKey("World");
				MyKey k3 = new MyKey("Java");
				MyKey k4 = new MyKey("Programming");

				Map<MyKey, String> m = new HashMap<>();

				m.put(k1, "Hello");
				m.put(k2, "World");
				m.put(k3, "Java");
				m.put(k4, "Programming");
				k1 = null;
				k2 = null;
				k3 = null;
				k4 = null;
				System.gc();
				System.out.println("Hash Map :" + m.toString());
		}
}
