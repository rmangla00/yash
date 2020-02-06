package com.yash.AssignmentCore2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfEvenTest {

	private SumOfEven sumOfEven = new SumOfEven();

	@Test
	public void shouldReturnSumOfEvenNumbersInArray() {

		int[] numbers = { 12, 3, 45, 65, 8, 9, 10, 4, 6 };

		int expectedSum = 40;
		int actualSum = sumOfEven.findSumOfEvenNumbers(numbers);

		assertEquals(expectedSum, actualSum);
	}

}
