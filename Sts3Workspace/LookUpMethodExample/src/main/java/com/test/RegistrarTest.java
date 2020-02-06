package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Registrar;

public class RegistrarTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Registrar reg = context.getBean("registrar", Registrar.class);
		System.out.println("test");
		reg.register("Mitali", 908098);
		reg.register("Pranali", 345564);
	}
}
