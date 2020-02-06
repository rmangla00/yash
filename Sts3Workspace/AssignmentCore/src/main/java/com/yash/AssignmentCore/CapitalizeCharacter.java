package com.yash.AssignmentCore;

import com.yash.Exception.EmptyStringException;

public class CapitalizeCharacter {

	public String capitalizeFirstAndLastCharcter(String inputString) {

		if (inputString.isEmpty())
			throw new EmptyStringException("Input String is Empty");
		else {
			String[] words = inputString.split(" ");

			String resultantString = "";
			for (int i = 0; i < words.length; i++) {
				String word = words[i];
				int length = word.length();
				word = word.substring(0, 1).toUpperCase() + word.substring(1, length - 1)
						+ word.substring(length - 1).toUpperCase();
				resultantString += word;
				if (i < words.length - 1)
					resultantString += " ";
			}
			return resultantString;
		}
	}
}
