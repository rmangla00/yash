package com.yash.first;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanDef.xml");
//		Coach coach = context.getBean("myCoach", Coach.class);

		Coach coach = context.getBean("cricketCoach", Coach.class);
		coach.getDailyWorkout();

		coach.getFortune();

		context.close();
		
		String str = "Ea";
		
		System.out.println(str.hashCode());

	}
}