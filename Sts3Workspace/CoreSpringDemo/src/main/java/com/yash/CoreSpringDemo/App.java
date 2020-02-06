package com.yash.CoreSpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanDef.xml");
		Hello h = (Hello) context.getBean("hello");
//		h.show();
	}
}
