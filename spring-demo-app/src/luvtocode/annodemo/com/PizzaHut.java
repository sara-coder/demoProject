package luvtocode.annodemo.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaHut implements FoodDelivery {
	
	@Autowired
	@Qualifier("discountService")
	Discount discount;

	@Override
	public String getHotelName() {
		// TODO Auto-generated method stub
		return "Deliver from PizzaHut";
	}

	@Override
	public String getDiscountCoupan() {
		// TODO Auto-generated method stub
		return discount.getOffer();
	}

}
