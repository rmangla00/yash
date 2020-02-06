package com.yash.AssignmentCore;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.yash.Exception.NumberNotFoundException;

public class ReplaceElementWithInArrayTest {

	ReplaceElementWithInArray replaceElementWithInArray = new ReplaceElementWithInArray();

	@Test
	public void shouldReplaceElementWhenFoundInArrayList() {
		List<Integer> expected = Arrays.asList(55, 6, 368);

		List<Integer> actual = replaceElementWithInArray.replaceElement(25, 6);

		assertEquals(expected, actual);
	}

	@Test(expected = NumberNotFoundException.class)
	public void shouldThrowExceptionWhenElementNotFoundInArrayList() {
		List<Integer> expected = Arrays.asList(55, 6, 368);

		List<Integer> actual = replaceElementWithInArray.replaceElement(50, 6);

		assertEquals(expected, actual);
	}

}
