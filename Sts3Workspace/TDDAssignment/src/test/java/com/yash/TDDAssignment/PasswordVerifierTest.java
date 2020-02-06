package com.yash.TDDAssignment;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PasswordVerifierTest {

	PasswordVerifier passwordVerifier = new PasswordVerifier();

	@Test
	public void checkPasswordshouldLargerThenEightCharacters() {
		Boolean actual = passwordVerifier.verfiy("Qwerty123");
		assertTrue(actual);
	}

	@Test(expected = RuntimeException.class)
	public void checkPasswordshouldLessThenEightCharacters() {
		passwordVerifier.verfiy("Qwey12");		
	}

	@Test
	public void checkPasswordshouldNotNull() {
		Boolean actual = passwordVerifier.verfiy("Qwerty123");
		assertTrue(actual);
	}

	@Test(expected = RuntimeException.class)
	public void checkPasswordisNull() {
		passwordVerifier.verfiy(null);		
	}

	@Test
	public void checkPasswordshouldHaveAtLeastOneUpperCaseLetter() {
		Boolean actual = passwordVerifier.verfiy("Qwerty123");
		assertTrue(actual);
	}

	@Test(expected = RuntimeException.class)
	public void checkPasswordIsNotHavingAtLeastOneUpperCaseLetter() {
		passwordVerifier.verfiy("qwerty123");
	}

	@Test
	public void checkPasswordshouldHaveAtLeastOneLowerCaseLetter() {
		Boolean actual = passwordVerifier.verfiy("Qwerty123");
		assertTrue(actual);
	}

	@Test(expected = RuntimeException.class)
	public void checkPasswordIsNotHavingAtLeastOneLowerCaseLetter() {
		passwordVerifier.verfiy("QWERTY123");
	}

	@Test
	public void checkPasswordshouldHaveAtLeastOneNumber() {
		Boolean actual = passwordVerifier.verfiy("Qwerty123");
		assertTrue(actual);
	}

	@Test(expected = RuntimeException.class)
	public void checkPasswordshouldNotHaveAtLeastOneNumber() {
		passwordVerifier.verfiy("Qwertyqwq");
	}

	@Test
	public void passwordShouldValidIfAtLeastThreeOfConditionsAreTrue() {
		Boolean actual = passwordVerifier.verfiy("Qwerty123");
		assertTrue(actual);
	}
	@Test(expected = RuntimeException.class)
	public void passwordShouldInValidIfThreeOfConditionsAreFalse() {
		passwordVerifier.verfiy(null);
	}

}
