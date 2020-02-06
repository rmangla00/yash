package com.yash.AssignmentCore;

import java.time.LocalDate;

public class ChangeDate {

	public LocalDate changeCurrentDateByAddingNumberOfDays(long noOfDays) {
		LocalDate currentDate = LocalDate.now();
		return currentDate.plusDays(noOfDays);
	}
}
