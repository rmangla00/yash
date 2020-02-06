package com.beans;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityService {

	@Pointcut(value = "execution(* com.beans.AccountService.my*(..))")
	public void method1(){
		
	}
	
	@Pointcut(value = "execution(* com.beans.CustomerService.up*(..))")
	public void method2(){
		
	}
	
	@Before(value = "method1()")
	public void verifyUser(){
		System.out.println("SecurityService.verifyUser()");
	}
}
