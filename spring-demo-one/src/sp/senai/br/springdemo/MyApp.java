package sp.senai.br.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// create the object
		//Coach baseballCoach = new BaseBallCoach();
		Coach trackCoach = new TrackCoach();
		
		// use the object
		//System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyWorkout());
		
	}

}
