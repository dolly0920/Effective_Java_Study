package com.example.sypark9646.item05;

import com.example.sypark9646.item5.PersonSupplierConstruct;
import java.time.LocalDate;
import java.util.function.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SupplierTest {

//	@Test
//	@DisplayName("Supplier 테스트")
//	public void testSupplierClass() throws InterruptedException {
//		// current date 2020-01-30
//		PersonSupplierConstruct person = new PersonSupplierConstruct("Soyeon Park", LocalDate.parse("2020-01-30"));
//		PersonSupplierConstruct.printAge(person);
//		TimeUnit.DAYS.sleep(1);
//		PersonSupplierConstruct.printAge(person);
//	}

	@Test
	public void testGetAge() {
		Supplier<LocalDate> injectedNow = () -> LocalDate.parse("2020-01-30");
		PersonSupplierConstruct person1 = new PersonSupplierConstruct("Soyeon Park", LocalDate.parse("1996-04-06"), injectedNow);
		PersonSupplierConstruct person2 = new PersonSupplierConstruct("Soyeon Park", LocalDate.parse("1996-04-06"));

		Assertions.assertEquals(person1.getAge(), person2.getAge());
	}
}
