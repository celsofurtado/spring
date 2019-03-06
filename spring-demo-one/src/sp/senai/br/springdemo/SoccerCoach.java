package sp.senai.br.springdemo;

public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SoccerCoach() {}
	
	public SoccerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes with shoots at goal. ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
