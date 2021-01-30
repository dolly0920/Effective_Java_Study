package com.example.sypark9646.item5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {

	final String name;
	private final LocalDate dateOfBirth;
	private final LocalDate currentDate;

	public Person(String name, LocalDate dateOfBirth) {
		this(name, dateOfBirth, LocalDate.now());
	}

	public Person(String name, LocalDate dateOfBirth, LocalDate currentDate) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.currentDate = currentDate;
	}

	long getAge() {
		return ChronoUnit.YEARS.between(dateOfBirth, currentDate);
	}

}
