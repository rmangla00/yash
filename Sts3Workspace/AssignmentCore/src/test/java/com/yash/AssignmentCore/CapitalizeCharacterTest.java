package com.yash.AssignmentCore;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.Exception.EmptyStringException;

public class CapitalizeCharacterTest {

	CapitalizeCharacter capitalCharcter = new CapitalizeCharacter();

	@Test
	public void shouldReturnStringWithCapitalFirstAndLastCharacter() {
		String expected = "YasH OfficE PunE";

		String actual = capitalCharcter.capitalizeFirstAndLastCharcter("yash office pune");

		assertEquals(expected, actual);
	}

	@Test(expected = EmptyStringException.class)
	public void shouldThrowExceptionWhenInputStringIsEmpty() {
		String expected = "";

		String actual = capitalCharcter.capitalizeFirstAndLastCharcter("");

		assertEquals(expected, actual);
	}

}
