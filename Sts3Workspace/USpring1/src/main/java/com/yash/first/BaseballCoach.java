package com.yash.first;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public void getDailyWorkout() {
		System.out.println("inside BaseballCoach.getDailyWorkout()");
	}

	@Override
	public void getFortune() {
		System.out.println("from baseballcoach");
		fortuneService.getFortune();
	}

}
