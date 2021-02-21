package com.example.sypark9646.item14;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EqualsAndCompareToCollectionTest {

		@Test
		@DisplayName("HashSet와 TreeSet의 동작 방식을 비교한다")
		void equalsAndCompareToCollectionTest() {
				HashSet<BigDecimal> hashSet = new HashSet<>();
				TreeSet<BigDecimal> treeSet = new TreeSet<>();

				hashSet.add(new BigDecimal("1.0"));
				hashSet.add(new BigDecimal("1.00"));

				treeSet.add(new BigDecimal("1.0"));
				treeSet.add(new BigDecimal("1.00"));

				Assertions.assertEquals(2, hashSet.size());
				Assertions.assertEquals(1, treeSet.size());
		}

		@Test
		@DisplayName("Comparable 구현 테스트")
		void testCustomComparable() {
				List<Person> people = new ArrayList<>();

				people.add(new Person("aaa", "aaa", 3)); // 3
				people.add(new Person("bbb", "bbb", 1)); // 4
				people.add(new Person("aaa", "aaa", 1)); // 2
				people.add(new Person("aa", "a", 4)); // 1
				Collections.sort(people);

				System.out.println(people);
		}
}
