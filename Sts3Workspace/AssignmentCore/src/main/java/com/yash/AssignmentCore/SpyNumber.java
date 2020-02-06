package com.yash.AssignmentCore;

public class SpyNumber {

	public boolean checkSpyNumber(int input) {

		int sumOfDigits = 0;
		int multiplicationOfDigits = 1;

		while (input > 0) {
			int number = input % 10;
			sumOfDigits += number;
			multiplicationOfDigits *= number;
			input /= 10;
		}
		if (sumOfDigits == multiplicationOfDigits)
			return true;
		else
			return false;
	}
}
