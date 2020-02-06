package com.yash.AssignmentCore4;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class IndicesOfTwoNumbersTest {

	IndicesOfTwoNumbers indicesOfTwoNumbers = new IndicesOfTwoNumbers();

	@Test
	public void shouldReturnIndicesOfNumberWhichMeetsTarget() {

		int[] nums = { 2, 11, 7, 15 };
		int targetSum = 9;
		int[] actuals = indicesOfTwoNumbers.getArrayOfIndices(nums, targetSum);
		int[] expecteds = { 0, 2 };

		assertArrayEquals(expecteds, actuals);

	}

}
