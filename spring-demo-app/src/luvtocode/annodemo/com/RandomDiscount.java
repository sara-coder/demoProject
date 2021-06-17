package luvtocode.annodemo.com;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class RandomDiscount implements Discount {

	String discounts [] = {"Monday special","Weekend Special","Workday special"};
	Random myRamdom = new Random();
	@Override
	public String getOffer() {
		int index = myRamdom.nextInt(discounts.length);
		
		return discounts[index];
	}

}
