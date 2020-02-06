package com.yash.AssignmentCore;

import java.util.List;

public class WrongInSeries {

	public int getWrongInSeries(List<Integer> series) {
		int wrongElement = 0;
		for (int i = 0; i < series.size() - 2; i++) {
			if (i % 2 == 0) {
				if (series.get(i + 2) - series.get(i) != 5) {
					wrongElement = series.get(i + 2);
					break;
				}
			} else {
				if (series.get(i + 2) - series.get(i) != 10) {
					wrongElement = series.get(i + 2);
					break;
				}
			}
		}
		return wrongElement;
	}
}
