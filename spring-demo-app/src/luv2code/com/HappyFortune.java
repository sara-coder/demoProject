package luv2code.com;

public class HappyFortune implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		String fortunes [] = {"Great day ahead","blessed with good luck","victory is yours"};
		return fortunes[(int) (Math.random()*2)];
	}

}
