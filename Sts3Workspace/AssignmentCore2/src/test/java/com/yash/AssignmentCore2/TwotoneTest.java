package com.yash.AssignmentCore2;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TwotoneTest {

	@Test
	public void shouldReturnOnlyTwoInstanceWhenCalledGetInstance() {

		Twotone expected_1 = Twotone.getInstance();
		Twotone expected_2 = Twotone.getInstance();

		Twotone actual = Twotone.getInstance();

		assertThat(actual, anyOf(is(expected_1), is(expected_2)));
	}

}
