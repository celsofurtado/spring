package sp.senai.br.springdemo;

import java.util.Random;

public class MyRandomFortuneService implements FortuneService {

	private String[] message = {
			"Today is a nice day!", 
			"You are a winner!", 
			"Congratulations guy!"
			};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		
		int choice = random.nextInt(message.length);
		
		return message[choice];
	}

}
