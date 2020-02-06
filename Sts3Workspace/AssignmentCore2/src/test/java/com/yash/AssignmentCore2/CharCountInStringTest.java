package com.yash.AssignmentCore2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharCountInStringTest {

	private CharCountInString charCountInString = new CharCountInString();

	@Test
	public void shouldReturnLinkedHashMapWithCharCountInGivenString() {

		String expected = "ia2m2y2she3plo";

		String actual = charCountInString.countCharInString("iamyashemployee");
		assertEquals(expected, actual);
	}

}
