package com.yash.AssignmentCore2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashmap {

	public Map<String, Integer> sortHashMapByValue(HashMap<String, Integer> map) {
		Map<String, Integer> sorted = map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		return sorted;
	}

}
