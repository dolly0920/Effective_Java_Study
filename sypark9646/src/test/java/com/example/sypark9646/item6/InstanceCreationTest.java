package com.example.sypark9646.item6;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class InstanceCreationTest {

	public static int CYCLE = 5500000;

	@Test
	public void testRecycleInstance() {
		long beforeTime = System.currentTimeMillis();
		Map<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < CYCLE; i++) {
			map.put(i, Boolean.valueOf("true"));
		}
		long afterTime = System.currentTimeMillis();
		System.out.println("testRecycleInstance 시간차이: " + (afterTime - beforeTime)); // 451
	}

	@Test
	public void testNewInstance() {
		long beforeTime = System.currentTimeMillis();
		Map<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < CYCLE; i++) {
			map.put(i, new Boolean("true"));
		}
		long afterTime = System.currentTimeMillis();
		System.out.println("testNewInstance 시간차이: " + (afterTime - beforeTime)); // 520
	}
}
