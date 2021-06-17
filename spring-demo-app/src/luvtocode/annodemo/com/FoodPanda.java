package luvtocode.annodemo.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FoodPanda implements FoodDelivery {
	
	

	@Autowired
	@Qualifier("hotelDiscount")
	Discount discount;

	@Override
	public String getHotelName() {
		// TODO Auto-generated method stub
		return "Delivered from FoodPanda";
	}

	@Override
	public String getDiscountCoupan() {
		return discount.getOffer();
	}

}
