package com.yash.CoreSpringDemo;

public class A {

	private int a;
	private String msg;

	public A() {
		System.out.println("A's Default constructor");
	}

	public void setA(int a) {
		System.out.println("A's a set");
		this.a = a;
	}

	public void setMsg(String msg) {
		System.out.println("A's msg set");
		this.msg = msg;
	}

	public void show() {
		System.out.println("A's show");
		System.out.println(a);
		System.out.println(msg);
	}
}
