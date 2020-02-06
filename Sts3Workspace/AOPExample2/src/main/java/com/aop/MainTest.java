package com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.model.ShapeService;

public class MainTest {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AOPConfigration.class);

		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		shapeService.getCircle().setName("temp name");
		System.out.println(shapeService.getCircle().getName());
		
		ctx.close();
	}

}
