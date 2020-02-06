package com.yash.TDDAssignment;

public class NegativeNumberException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final String message;

	public NegativeNumberException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
