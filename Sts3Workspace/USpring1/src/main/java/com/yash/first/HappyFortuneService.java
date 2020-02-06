package com.yash.first;

public class HappyFortuneService implements FortuneService {

	@Override
	public void getFortune() {
		System.out.println("inside HappyFortuneService.getFortune()");
	}

}
