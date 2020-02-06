package com.yash.AssignmentCore2;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class LeaderInListTest {

	private LeaderInList leaderInList = new LeaderInList();

	@Test
	public void shouldReturnAllLeadersInAnArray() {
		int[] numbers = { 3, 5, 4, 9, 7, 6, 11 };

		int[] expecteds = { 3, 5, 9, 11 };
		int[] actuals = leaderInList.findLeaderInList(numbers);

		assertArrayEquals(expecteds, actuals);
	}

}
