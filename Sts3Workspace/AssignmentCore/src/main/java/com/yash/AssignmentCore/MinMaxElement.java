package com.yash.AssignmentCore;

import java.util.Arrays;
import java.util.List;

import com.yash.Exception.EmptyListException;

public class MinMaxElement {

	public List<Integer> findMinAndMaxElement(List<Integer> inputList) {
		if (inputList.isEmpty()) {
			throw new EmptyListException("Input list is empty");

		} else {
			Integer max = inputList.stream().max(Integer::compare).get();

			Integer min = inputList.stream().min(Integer::compare).get();

			return Arrays.asList(min, max);
		}
	}

}
