package com.yash.AssignmentCore2;

import java.io.Serializable;

final public class Singletone implements Serializable {

	private static final long serialVersionUID = 1L;

	private static Singletone instance;

	private Singletone() {
	}

	public static Singletone getInstance() {
		if (instance == null) {
			synchronized (Singletone.class) {
				if (instance == null) {
					instance = new Singletone();
				}
			}
		}
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

}
