package com.yash.AssignmentCore;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class WrongInSeriesTest {

	WrongInSeries wrongInSeries = new WrongInSeries();

	@Test
	public void shouldReturnWrongNumberAtEvenPlaceInSeries() {
		int expected = 19;

		int actual = wrongInSeries.getWrongInSeries(Arrays.asList(3, 12, 8, 19, 13, 32, 18, 42, 23, 52));
		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturnWrongNumberAtOddPlaceInSeries() {
		int expected = 9;

		int actual = wrongInSeries.getWrongInSeries(Arrays.asList(3, 12, 8, 22, 9, 32, 18, 42, 23, 52));
		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturnZeroWhenThereIsNoWrongNumberInSeries() {
		int expected = 0;

		int actual = wrongInSeries.getWrongInSeries(Arrays.asList(3, 12, 8, 22, 13, 32, 18, 42, 23, 52));
		assertEquals(expected, actual);
	}

}
