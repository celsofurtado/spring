package br.senai.sp.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PingPongTest {

	public static void main(String[] args) {

		// read the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean (object) from the spring container
		Coach theCoach = context.getBean("pingPongCoach", Coach.class);
		
		// use a method from the bean (object)
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
