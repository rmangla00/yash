package com.yash.AssignmentCore2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramTest {

	private Anagram anagram = new Anagram();

	@Test
	public void shouldReturnTrueWhenInputStringsAreAnagram() {

		boolean actual = anagram.checkStringAnagram("Keep", "Peek");

		assertTrue(actual);
	}

	@Test
	public void shouldReturnFalseWhenInputStringsAreNotAnagram() {

		boolean actual = anagram.checkStringAnagram("Keep", "Peak");

		assertFalse(actual);
	}

	@Test
	public void shouldReturnFalseWhenLengthsOfInputStringsAreUnequal() {

		boolean actual = anagram.checkStringAnagram("Keep", "Peeks");

		assertFalse(actual);
	}

}
