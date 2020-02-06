package com.yash.AssignmentCore2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharCountInString {

	public String countCharInString(String inputString) {

		Map<Character, Integer> frequencies = inputString.chars().boxed().collect(Collectors
				.toMap(k -> Character.valueOf((char) k.intValue()), v -> 1, Integer::sum, LinkedHashMap::new)); // counting
		String resultString = frequencies.entrySet().stream().map(e -> {
			if (e.getValue() == 1)
				return e.getKey().toString();
			else
				return e.getKey().toString() + e.getValue().toString();
		}).collect(Collectors.joining(""));
		return resultString;
	}

}
