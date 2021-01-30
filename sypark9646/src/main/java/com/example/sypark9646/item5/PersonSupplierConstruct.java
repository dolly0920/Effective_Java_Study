package com.example.sypark9646.item5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Supplier;

public class PersonSupplierConstruct {

	final String name;
	private final LocalDate dateOfBirth;
	private final Supplier<LocalDate> currentDate;

	public PersonSupplierConstruct(String name, LocalDate dateOfBirth) {
		this(name, dateOfBirth, LocalDate::now);
	}

	public PersonSupplierConstruct(String name, LocalDate dateOfBirth, Supplier<LocalDate> currentDate) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.currentDate = currentDate;
	}

	public long getAge() {
		return ChronoUnit.YEARS.between(dateOfBirth, currentDate.get());
	}

	public static void printAge(PersonSupplierConstruct person) {
		System.out.println(person.name + " is " + person.getAge());
	}
}
