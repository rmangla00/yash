package com.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AOPConfigration.class);

		CustomerService customerService = (CustomerService) ctx.getBean("customerService");

		
		
		  customerService.addCustomer();
		  
		  System.out.println("=================");
		 
		
		  customerService.updateCustomer();
		  
		  System.out.println("=================");
		  
		  AccountService accountService = (AccountService)
		  ctx.getBean("accountService");
		  
		  accountService.myDeposite();
		  
		  System.out.println("=================");
//		  
//		  accountService.getBalance();
//		  
//		  System.out.println("=================");
//		  
//		  try{
//		  
//		  accountService.myWithdraw(); }catch(RuntimeException runtimeException){
//		  System.out.println("=======SORRY==========");
//		  
//		  }
//		 

		ctx.close();
	}

}
