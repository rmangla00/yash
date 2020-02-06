package com.yash.spring.propertyeditor;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

@Configuration
public class PropertyConfig {
	
	@Bean
	public Student student(){
		
		Student student = new Student();
		student.setStudentName("pappu");
		student.setPhone(123456L);
		return student;
	}
	
	@Bean(name ="sid")
	public String studentId(){
		return"A99-102";
	}
	
	@Bean
	public String fee(){
		return"10000,5000,5000";
	}
	
	@Bean
	public String emails(){
		return "aa@yash.com,bb@yash.com,cc@yash.com,dd@yash.com";
	}
	
	@Bean
	public List<Long> phones(){
		
		List<Long> phones = new ArrayList<>();
		phones.add(1111L);
		phones.add(2222L);
		phones.add(3333L);
		return phones;
	}
	
	
	@InitBinder
	public void test(WebDataBinder webDataBinder){
		
		System.out.println("======PropertyConfig.initIniderAll()========");
		
		webDataBinder.registerCustomEditor(List.class, new ListEditor());
		webDataBinder.registerCustomEditor(Fee.class, new FeeEditor());
		webDataBinder.registerCustomEditor(StudentID.class, new StudentIDEditor());
	}
	
	

}
