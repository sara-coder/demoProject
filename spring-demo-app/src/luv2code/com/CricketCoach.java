package luv2code.com;

public class CricketCoach implements Coach {
	
FortuneService fortuneService;
String email;
String teamName;
	
	public CricketCoach(){
		System.out.println("Inside no arg Cricket coach constructor");
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside set fortune service");
	this.fortuneService = fortuneService;
}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice batting and bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("Inside set email service");
		this.email = email;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		System.out.println("Inside set tname service");
		this.teamName = teamName;
	}

}
