package com.yash.AssignmentCore2;

public class SecondHighestNumber {

	public int findSecondHighestNumber(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}

		}
		return numbers[numbers.length - 2];
	}

}
