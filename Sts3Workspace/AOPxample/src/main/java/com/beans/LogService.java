package com.beans;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogService {

	// execution(* com.deere.dpps.services.impl.* .*(..))
	@Pointcut(value = "execution(* com.beans.AccountService.my*(..))")
	public void method1() {
	}

	@Pointcut(value = "execution(* com.beans.CustomerService.up*(..))")
	public void method2() {
	}

	@Before("method1() or method2()")
	public void logBefore() {
		System.out.println("LogService.logBefore()");
	}

	@AfterReturning("method1()")
	public void logReturning() {
		System.out.println("LogService.logReturning()");
	}

	@AfterThrowing("method1()")
	public void logThrowing() {
		System.out.println("LogService.logThrowing()");
	}

	@After("method1()")
	public void logAfter() {
		System.out.println("LogService.logAfter()");
	}

}
