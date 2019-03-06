package br.senai.sp.springdemo;

import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice how to put the ball on the left side.";
	}

}
