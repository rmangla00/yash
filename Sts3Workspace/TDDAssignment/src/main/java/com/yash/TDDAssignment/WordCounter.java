package com.yash.TDDAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCounter {

	public Map<String, Long> countDistinctWords(String inputString) {

		List<String> listOfWords = Arrays.asList(inputString.split(" "));
		Map<String, Long> wordCount = listOfWords.stream()
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		
		return wordCount;
		
	}

}
