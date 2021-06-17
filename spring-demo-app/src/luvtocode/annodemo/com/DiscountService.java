package luvtocode.annodemo.com;

import org.springframework.stereotype.Component;

@Component
public class DiscountService implements Discount {

	@Override
	public String getOffer() {
		String discounts [] = {"NewUser : 50%","Thrusday : 20 %","Luck user : 80%"};
		return discounts[(int) (Math.random()*2)];
	}

}
