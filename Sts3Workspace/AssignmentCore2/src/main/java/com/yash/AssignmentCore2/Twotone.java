package com.yash.AssignmentCore2;

public class Twotone {

	private static Twotone instance1 = null;
	private static Twotone instance2 = null;

	private Twotone() {
	}

	public static Twotone getInstance() {
		if (instance1 == null) {
			instance1 = new Twotone();
			return instance1;
		} else if (instance2 == null) {
			instance2 = new Twotone();
			return instance2;
		} else {
			if (Math.random() < 0.5)
				return instance1;
			else
				return instance2;
		}
	}
}
