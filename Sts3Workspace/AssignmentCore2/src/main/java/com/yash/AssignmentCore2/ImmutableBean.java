package com.yash.AssignmentCore2;

public class ImmutableBean {

	private int val = 0;

	private ImmutableBean(int val) {
		this.val = val;
	}

	public static ImmutableBean getInstance(int val) {
		return new ImmutableBean(val);
	}

	public int getI() {
		return val;
	}
}
