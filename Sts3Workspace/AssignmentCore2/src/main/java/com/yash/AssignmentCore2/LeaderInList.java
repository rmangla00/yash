package com.yash.AssignmentCore2;

import java.util.ArrayList;
import java.util.List;

public class LeaderInList {

	public int[] findLeaderInList(int[] numbers) {

		List<Integer> leaders = new ArrayList<Integer>();
		leaders.add(numbers[0]);

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers[i - 1]) {
				leaders.add(numbers[i]);
			}
		}

		return leaders.stream().mapToInt(Integer::intValue).toArray();
	}

}
