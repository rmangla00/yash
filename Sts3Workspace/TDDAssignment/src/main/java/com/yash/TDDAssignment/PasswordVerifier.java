package com.yash.TDDAssignment;

public class PasswordVerifier {

	public boolean verfiy(String password) {
		if (password != null) {
			if (password.chars().anyMatch(ch -> Character.isLowerCase(ch))) {
				if (password.length() >= 8 && password.chars().anyMatch(ch -> Character.isUpperCase(ch))
						&& password.chars().anyMatch(ch -> Character.isDigit(ch))) {
					return true;

				} else {
					throw new RuntimeException("Password is not satisfying any three condition");
				}
			} else {
				throw new RuntimeException("Input Password is does not have any lower case latter");
			}
		} else {
			throw new RuntimeException("Input Password is null");
		}
	}
}
