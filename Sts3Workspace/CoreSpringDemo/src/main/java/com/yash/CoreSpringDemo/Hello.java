package com.yash.CoreSpringDemo;

public class Hello {

	private A a;
	private B b;

	public Hello(B b) {
		System.out.println("Hello's Parametric constructor");
		this.b = b;
	}

	public Hello() {
		System.out.println("Hello's Default constructor");
	}

	public void setA(A a) {
		System.out.println("Hello's A set");
		this.a = a;
	}

	public void show() {
		System.out.println("Hello's show");
		a.show();
		b.show();
	}

}
