package com.example.sypark9646.item14;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

@ToString
@Getter
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class Person implements Comparable<Person> {

		private final String firstName;
		private final String lastName;
		private final int age;

		@Override
		public int compareTo(Person o) {
				if (StringUtils.equals(firstName, o.firstName)) {
						if (StringUtils.equals(lastName, o.lastName)) {
								return Integer.compare(age, o.age);
						}

						return String.CASE_INSENSITIVE_ORDER.compare(lastName, o.lastName);
				}
				return String.CASE_INSENSITIVE_ORDER.compare(firstName, o.firstName);
		}
}
