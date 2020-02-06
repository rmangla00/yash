package com.yash.first;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public void getDailyWorkout() {
		System.out.println("inside TrackCoach.getDailyWorkout()");
	}

	@Override
	public void getFortune() {
		System.out.println("inside TrackCoach.getFortune()");
		fortuneService.getFortune();
	}

}
