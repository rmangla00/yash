package com.yash.AssignmentCore2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SecondHighestNumberTest {

	private SecondHighestNumber secondHighestNumber = new SecondHighestNumber();

	@Test
	public void shouldRetrunSecondHighestNumberInArray() {

		int[] numbers = { 19, 117, 17, 13, 21, 543 };

		int expected = 117;
		int actual = secondHighestNumber.findSecondHighestNumber(numbers);

		assertEquals(expected, actual);
	}

}
