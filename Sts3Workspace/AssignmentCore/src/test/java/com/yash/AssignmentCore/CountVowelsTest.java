package com.yash.AssignmentCore;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountVowelsTest {

	CountVowels countVowels = new CountVowels();

	@Test
	public void shouldReturnNoOfVowelsWhenInputStringIsValid() {
		int expected = 9;
		int actual = countVowels.countNoOfVowels("includehelpaeiou");

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturnZeroWhenInputStringIsEmpty() {
		int expected = 0;
		int actual = countVowels.countNoOfVowels("");

		assertEquals(expected, actual);
	}

}
