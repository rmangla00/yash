package com.yash.TDDAssignment;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringCalculator {

	private final Logger logger = Logger.getLogger(StringCalculator.class.getName());
	int sumOfNumbers = 0;

	public int calculator(String stringNumber) {
		String delimiter = "";

		if (stringNumber.isEmpty())
			return 0;
		else if (stringNumber.length() == 1)
			return Integer.parseInt(stringNumber);
		else {
			if (stringNumber.startsWith("//")) {
				delimiter = stringNumber.substring(2, 3);
				stringNumber = stringNumber.substring(4);
			}
			String[] numbersString = stringNumber.split("[, | \n | ;" + delimiter + "]");

			Arrays.asList(numbersString).stream().mapToInt(numberString -> Integer.parseInt(numberString))
					.forEach(number -> {

						if (number < 0)
							throw new NegativeNumberException(
									"Negative Number Not allowed, Please enter postive number.");

						if (number >= 1000)
							number = 0;

						sumOfNumbers += number;

					});
		}
		logger.log(Level.INFO, sumOfNumbers + "");
		return sumOfNumbers;
	}

}
