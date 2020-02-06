package com.yash.CoreSpringDemo;

public class Hello {

	private A a;
	
	public Hello() {
		System.out.println("Hello's Default constructor");
	}

	public void setA(A a) {
		System.out.println("Hello's A set");
		this.a = a;
	}

	
}
