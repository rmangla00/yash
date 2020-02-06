package com.yash.AssignmentCore;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.yash.Exception.EmptyListException;

public class MinMaxElementTest {

	MinMaxElement minMaxElement = new MinMaxElement();

	@Test
	public void shouldRetrunListOfMinAndMaxElementInList() {

		List<Integer> inputList = Arrays.asList(55, 102, 1000, 43, 544, 10);

		List<Integer> expected = Arrays.asList(10, 1000);

		List<Integer> actual = minMaxElement.findMinAndMaxElement(inputList);

		assertEquals(expected, actual);
	}

	@Test(expected = EmptyListException.class)
	public void shouldThrowExceptionWhenInputListIsEmpty() {

		List<Integer> inputList = Arrays.asList();

		minMaxElement.findMinAndMaxElement(inputList);

	}

}
