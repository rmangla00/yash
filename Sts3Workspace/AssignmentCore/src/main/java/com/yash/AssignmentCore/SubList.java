package com.yash.AssignmentCore;

import java.util.List;

import com.yash.Exception.EmptyListException;

public class SubList {

	public List<Integer> createSubList(List<Integer> inputList, int fromIndex, int toIndex) {
		if (inputList.isEmpty()) {
			throw new EmptyListException("Input list is empty");
		} else {
			return inputList.subList(fromIndex, toIndex);
		}
	}

}
