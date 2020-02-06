package com.yash.AssignmentCore2;

import java.util.Arrays;

public class SumOfEven {

	public int findSumOfEvenNumbers(int[] numbers) {
		return Arrays.stream(numbers).filter(n -> n % 2 == 0).sum();
	}

}
