package com.yash.Util;

public class VendingMachineException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final String message;

	public VendingMachineException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
