package sp.senai.br.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Activity2 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("soccerCoach", Coach.class);
		
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
	
	}

}
