package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Pointcut("execution(* com.aop.model.Circle.get*())")
	public void allGetters() {
	}

	@Pointcut("within(com.aop.model.Circle)")
	public void allCircleMethods() {
	}

	/*
	 * @AfterReturning(pointcut = "allGetters()", returning = "name") public void
	 * loggingAdvice(String name) {
	 * System.out.println("Befor getName() -> LoggingAspect.loggingAdvice()");
	 * System.out.println("returning String ***" + name); }
	 */

	@Around("allGetters()")
	public Object arroundLoggingAdvice(ProceedingJoinPoint joinPoint) {
		Object returnValue = null;
		try {
			System.out.println("LoggingAspect.arroundLoggingAdvice() - Before");
			returnValue = joinPoint.proceed();
			System.out.println("LoggingAspect.arroundLoggingAdvice() - After");
		} catch (Throwable e) {
			System.out.println("after throwing");
		}
		System.out.println("afetr finally");
		
		return returnValue;
	}

	/*
	 * @Before("allCircleMethods()") public void secondLoggingAdvice() {
	 * System.out.println("Befor getName() -> LoggingAspect.secondLoggingAdvice()");
	 * }
	 * 
	 * @Before("allCircleMethods()") public void loggingAdvice(JoinPoint jp) {
	 * System.out.println(jp.toString()); System.out.println(jp.getTarget()); }
	 */

}
