package com.yash.CoreSpringDemo;

public class B {

	private int b;
	private String msg;
	
	public B(int b, String msg) {
		System.out.println("B's 2-args constructor");
		this.b = b;
		this.msg = msg;
	}

	public void show() {
		System.out.println("B's show");
		System.out.println(b);
		System.out.println(msg);
	}

}
