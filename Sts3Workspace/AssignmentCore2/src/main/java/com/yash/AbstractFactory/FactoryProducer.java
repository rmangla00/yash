package com.yash.AbstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactoryRounded(boolean rounded) {
		if (rounded) {
			return new RoundedShapeFactory();
		} else {
			return new ShapeFactory();
		}
	}
}