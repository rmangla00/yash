package com.yash.AssignmentCore2;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class SortHashmapTest {

	private SortHashmap sortedHashmap = new SortHashmap();

	@Test
	public void shouldReturnSortedHashmap() {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("rakesh", 101);
		map.put("rajat", 105);
		map.put("nikhil", 102);
		map.put("bhaskar", 104);
		map.put("preena", 115);
		map.put("mitali", 110);
		map.put("mayank", 109);

		LinkedHashMap<String, Integer> expected = new LinkedHashMap<>();
		expected.put("rakesh", 101);
		expected.put("nikhil", 102);
		expected.put("bhaskar", 104);
		expected.put("rajat", 105);
		expected.put("mayank", 109);
		expected.put("mitali", 110);
		expected.put("preena", 115);

		Map<String, Integer> actual = sortedHashmap.sortHashMapByValue(map);

		assertEquals(expected.toString(), actual.toString());
	}

}
