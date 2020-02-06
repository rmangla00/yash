package com.yash.CoreSpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanDef.xml");
		A a = (A) context.getBean("beanA");

		String str = "yash";
		String str2 = "tech";

		String str3 = str + str2;
	}
}
