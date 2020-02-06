package com.yash.TDDAssignment;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordCounterTest {

	WordCounter wordCounter = new WordCounter();

	@Test
	public void shouldReturnCountOfDistinctWordsOfGivenString() {
		Map<String, Long> expacted = new HashMap<String, Long>();
		expacted.put("boom", (long) 2);
		expacted.put("bang", (long) 1);
		
		Map<String, Long> actual = wordCounter.countDistinctWords("boom bang boom");
		
		assertEquals(expacted, actual);

	}

}
