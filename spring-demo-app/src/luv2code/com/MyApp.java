package luv2code.com;

import java.io.FileNotFoundException;

public class MyApp {

	public static void main(String[] args) {
		//create the object
		Coach coach = new TrackCoach();
		//use the object
		
		// print message
		System.out.println(coach.getDailyWorkout());
	}
	
}
