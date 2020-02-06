package com.yash.AssignmentCore;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SpyNumberTest {

	SpyNumber spyNumber = new SpyNumber();

	@Test
	public void shouldReturnTrueWhenInputIsSpyNumber() {
		boolean actual = spyNumber.checkSpyNumber(1421);
		assertTrue(actual);
	}

	@Test
	public void shouldReturnFalseWhenInputIsNotSpyNumber() {
		boolean actual = spyNumber.checkSpyNumber(121);
		assertFalse(actual);
	}

}
