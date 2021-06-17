package luv2code.com;

public class BaseBallCoach implements Coach {
	
	FortuneService fortuneService;
	
	public BaseBallCoach() {
		System.out.println("Inside no arg BaseBallCoach constructor");
	}
	public BaseBallCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice throws!!!";
		
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
