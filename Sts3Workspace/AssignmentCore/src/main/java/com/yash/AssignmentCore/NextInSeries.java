package com.yash.AssignmentCore;

import java.util.List;

public class NextInSeries {

	public int getNextInSeries(List<Integer> series) {
		int nextElement = series.get(0);
		for (int i = 1; i < series.size() + 1; i++) {
			if (i % 2 == 0) {
				nextElement -= 2;
			} else {
				nextElement += 3;
			}
			if (i > series.size())
				break;
		}
		return nextElement;
	}

}
