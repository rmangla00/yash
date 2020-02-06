package com.yash.TDDAssignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fizzbuzz = new FizzBuzz();

	@Test
	public void shouldReturnFizzIfDivisibleByThree() {
		String actual = fizzbuzz.numberDivisibleByThree(3);

		assertEquals("Fizz", actual);
	}

	@Test
	public void shouldReturnBuzzIfDivisibleByFive() {
		String actual = fizzbuzz.numberDivisibleByThree(5);

		assertEquals("Buzz", actual);
	}
	
	@Test
	public void shouldReturnFizzBuzzIfDivisibleByFiveAndThree() {
		String actual = fizzbuzz.numberDivisibleByThree(15);

		assertEquals("FizzBuzz", actual);
	}

	@Test
	public void shouldReturnNumberIfDivisibleByFiveOrThree() {
		String actual = fizzbuzz.numberDivisibleByThree(14);

		assertEquals("14", actual);
	}

}
