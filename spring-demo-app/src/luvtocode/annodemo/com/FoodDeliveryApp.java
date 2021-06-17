package luvtocode.annodemo.com;

import org.springframework.beans.propertyeditors.ClassArrayEditor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FoodDeliveryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnno.xml");
		//FoodDelivery fd = context.getBean("zomato",FoodDelivery.class);
		Zomato fd = context.getBean("zomato",Zomato.class);
		
		System.out.println(fd.getHotelName());
		System.out.println(fd.getDiscountCoupan());
		System.out.println(fd.getMenuList());
		context.close();
	}

}
