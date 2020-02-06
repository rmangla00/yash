package com.beans;

public class AccountService {

	public void getBalance() {

		System.out.println("AccountService.getBalance()");

		System.out.println("AccountService getBalance ===> Begin");
		System.out.println("AccountService getBalance ===> Done");
		System.out.println("AccountService getBalance ===> End");
	}

	public void myDeposite() {

		System.out.println("AccountService.myDeposite()");
		
		System.out.println("AccountService myDeposite ===> Begin");
		System.out.println("AccountService myDeposite ===> Done");
		System.out.println("AccountService myDeposite ===> End");

	}

	public void myWithdraw() throws RuntimeException {

		System.out.println("AccountService Withdraw ===> Begin");

		if (1 == 1) {

			throw new InSufficientFundException();

		}

		System.out.println("AccountService myDeposite ===> End");
	}

}
