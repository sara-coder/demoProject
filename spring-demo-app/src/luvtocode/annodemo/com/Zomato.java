package luvtocode.annodemo.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Zomato implements FoodDelivery {
	
	@Value("${hotel.zomato}")
	private String menuList; 
	
	public String getMenuList() {
		return menuList;
	}

	@Autowired
	@Qualifier("randomDiscount")
	Discount discount;
	
	public Zomato() {
		System.out.println("inside default constructor");
	}

	@Override
	public String getHotelName() {
		// TODO Auto-generated method stub
		return "Delivered from Zomato";
	}

	@Override
	public String getDiscountCoupan() {
		// TODO Auto-generated method stub
		return discount.getOffer();
	}

}
