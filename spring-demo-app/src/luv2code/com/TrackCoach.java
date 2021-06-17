package luv2code.com;

public class TrackCoach implements Coach {
	FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	public TrackCoach() {
		System.out.println("Inside no arg track coach constructor");
	}
	@Override
	public String getDailyWorkout() {
		return "Run 5Kms";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
