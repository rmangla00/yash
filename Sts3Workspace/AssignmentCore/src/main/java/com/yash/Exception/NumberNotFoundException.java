package com.yash.Exception;

public class NumberNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NumberNotFoundException(String message) {
		super(message);
	}

}
