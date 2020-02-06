package com.yash.spring.propertyeditor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainClass {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);

		System.out.println("Spring container is Ready");

		System.out.println("============");
		
		Student student = (Student) ctx.getBean("student");
		
		
		System.out.println(student.getSid().getBid());
		System.out.println(student.getSid().getSid());
		
		System.out.println("============");
		
		System.out.println(student.getEmails());
		
		System.out.println("============");
		
		System.out.println(student.getPhones());
		ctx.close();
	}

}
