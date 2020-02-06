package com.yash.AssignmentCore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.yash.Exception.NumberNotFoundException;

public class ReplaceElementWithInArray {

	List<Integer> list = new ArrayList<Integer>();

	public ReplaceElementWithInArray() {
		list.add(55);
		list.add(25);
		list.add(368);
	}

	public List<Integer> replaceElement(Integer toReplace, Integer replaceWith) {

		if (list.contains(toReplace))
			Collections.replaceAll(list, toReplace, replaceWith);
		else
			throw new NumberNotFoundException("Number to replace [ " + toReplace + " ] is not present in list");
		return list;
	}

}
