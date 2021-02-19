package com.example.sypark9646.item07;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTest {

		public static void main(String[] args) {
				MyKey k1 = new MyKey("Hello");
				MyKey k2 = new MyKey("World");
				MyKey k3 = new MyKey("Java");
				MyKey k4 = new MyKey("Programming");

				Map<MyKey, String> wm = new WeakHashMap<>();

				wm.put(k1, "Hello");
				wm.put(k2, "World");
				wm.put(k3, "Java");
				wm.put(k4, "Programming");
				k1 = null;
				k2 = null;
				k3 = null;
				k4 = null;
				System.gc();
				System.out.println("Weak Hash Map :" + wm.toString());
		}
}
