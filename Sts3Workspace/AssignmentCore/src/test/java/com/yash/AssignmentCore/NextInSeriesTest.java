package com.yash.AssignmentCore;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class NextInSeriesTest {

	NextInSeries nextInSeries = new NextInSeries();

	@Test
	public void shouldReturnNextNumberWhenSeriesIsGiven() {
		int expected = 10;

		int actual = nextInSeries.getNextInSeries(Arrays.asList(7, 10, 8, 11, 9, 12));
		assertEquals(expected, actual);
	}

}
