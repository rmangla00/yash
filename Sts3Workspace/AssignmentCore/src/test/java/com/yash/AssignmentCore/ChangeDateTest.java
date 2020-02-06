package com.yash.AssignmentCore;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class ChangeDateTest {

	ChangeDate changeDate = new ChangeDate();

	@Test
	public void shouldReturnChangedDateAfterAddingNoOfDays() {
		LocalDate expected = LocalDate.now().plusDays(60);
		LocalDate actual = changeDate.changeCurrentDateByAddingNumberOfDays(60);

		assertEquals(expected, actual);
	}

}
