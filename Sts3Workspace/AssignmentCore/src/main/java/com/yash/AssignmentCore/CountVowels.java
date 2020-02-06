package com.yash.AssignmentCore;

public class CountVowels {

	public int countNoOfVowels(String inputString) {
		int noOfVowels = 0;

		if (!inputString.isEmpty()) {
			inputString = inputString.toLowerCase();

			for (char ch : inputString.toCharArray()) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					++noOfVowels;
				}
			}
		}

		return noOfVowels;
	}

}
