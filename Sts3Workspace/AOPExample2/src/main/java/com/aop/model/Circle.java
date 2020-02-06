package com.aop.model;

public class Circle {

	private String name = "circle name";

	public String getName() {
		System.out.println("get method call");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
