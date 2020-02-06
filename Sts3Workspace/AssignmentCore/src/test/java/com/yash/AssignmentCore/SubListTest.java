package com.yash.AssignmentCore;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.yash.Exception.EmptyListException;

public class SubListTest {

	SubList subList = new SubList();

	@Test
	public void shouldRetrunListOfMinAndMaxElementInList() {

		List<Integer> inputList = Arrays.asList(55, 102, 1000, 43, 544, 10);

		List<Integer> expected = Arrays.asList(102, 1000);

		List<Integer> actual = subList.createSubList(inputList, 1, 3);

		assertEquals(expected, actual);
	}

	@Test(expected = EmptyListException.class)
	public void shouldThrowEmptyListExceptionWhenInputListIsEmpty() {

		List<Integer> inputList = Arrays.asList();

		subList.createSubList(inputList, 1, 3);

	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void shouldThrowIndexOutOfBoundsExceptionWhenStratingIndexIsOutOfRange() {

		List<Integer> inputList = Arrays.asList(55, 102, 1000, 43, 544, 10);

		subList.createSubList(inputList, 8, 10);

	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void shouldThrowIndexOutOfBoundsExceptionWhenEndingIndexIsOutOfRange() {

		List<Integer> inputList = Arrays.asList(55, 102, 1000, 43, 544, 10);

		subList.createSubList(inputList, 2, 15);

	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentExceptionWhenStartingIndexIsGreaterThenEndingIndex() {

		List<Integer> inputList = Arrays.asList(55, 102, 1000, 43, 544, 10);

		subList.createSubList(inputList, 8, 3);

	}

}
