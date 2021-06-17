package luvtocode.annodemo.com;

import org.springframework.stereotype.Component;

@Component
public class HotelDiscount implements Discount {

	@Override
	public String getOffer() {
		// TODO Auto-generated method stub
		return "Regular user offer 10%";
	}

}
