package com.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.aop.aspect.LoggingAspect;
import com.aop.model.Circle;
import com.aop.model.ShapeService;
import com.aop.model.Triangle;

@Configuration
@EnableAspectJAutoProxy
public class AOPConfigration {

	@Bean
	public Circle circle() {
		return new Circle();
	}

	@Bean
	public Triangle triangle() {
		return new Triangle();
	}

	@Bean(name = "shapeService")
	public ShapeService shapeService() {
		return new ShapeService();
	}

	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}
}
