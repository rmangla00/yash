package com.yash.AssignmentCore2;

import org.junit.Test;

import com.yash.AbstractFactory.AbstractFactory;
import com.yash.AbstractFactory.FactoryProducer;
import com.yash.AbstractFactory.Shape;

public class AbstractFactoryTest {

	@Test
	public void shouldCheckShapeFactoryAbstractDesignPattern() {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactoryRounded(false);
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw();

	}
	
	@Test
	public void shouldCheckRoundedShapeFactoryAbstractDesignPattern() {
		AbstractFactory shapeFactory1 = FactoryProducer.getFactoryRounded(true);

		Shape shape3 = shapeFactory1.getShape("RECTANGLE");
		shape3.draw();

		Shape shape4 = shapeFactory1.getShape("SQUARE");
		shape4.draw();

	}
}
