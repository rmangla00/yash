package com.yash.TDDAssignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TDDAssignment.NegativeNumberException;
import com.yash.TDDAssignment.StringCalculator;

public class StringCalculatorTest {

	StringCalculator stringCalculator = new StringCalculator();

	@Test
	public void shouldReturnZeroWhenStringIsEmpty() {
		int actual = stringCalculator.calculator("");
		assertEquals(0, actual);
	}

	@Test
	public void shouldReturnSameNumberItselfWhenStrinHasOnlyOneNumber() {
		int actual = stringCalculator.calculator("5");
		assertEquals(5, actual);
	}

	@Test
	public void shouldReturnAdditionIfStringHasTwoNumber() {
		int actual = stringCalculator.calculator("5,9");
		assertEquals(14, actual);
	}

	@Test
	public void shouldReturnAdditionWhenStringHasMoreThanTwoNumber() {
		int actual = stringCalculator.calculator("1,2,3,4,5,6,7,8,9");
		assertEquals(45, actual);
	}

	@Test
	public void shouldReturnAdditionWhenStringHasNewLineAsSaparator() {
		int actual = stringCalculator.calculator("2\n4,7");
		assertEquals(13, actual);
	}

	@Test(expected = NegativeNumberException.class)
	public void shouldThrowExceptionWhenStringContainsNegativeNumber() {
		stringCalculator.calculator("-12,5");
	}

	@Test
	public void shouldReturnAdditionWhenStringHasNumberGreaterThanOneThousand() {
		int actual = stringCalculator.calculator("1004,12,16,1007");
		assertEquals(28, actual);
	}

	@Test
	public void shouldReturnAdditionWhenStringHasCustomDelimeter() {
		int actual = stringCalculator.calculator("//;\n1;2\n3;4");
		assertEquals(10, actual);
	}

}
