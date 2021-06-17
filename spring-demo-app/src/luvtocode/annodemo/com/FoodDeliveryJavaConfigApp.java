package luvtocode.annodemo.com;

import org.springframework.beans.propertyeditors.ClassArrayEditor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FoodDeliveryJavaConfigApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FoodConfig.class);
		//FoodDelivery fd = context.getBean("zomato",FoodDelivery.class);
		Zomato fd = context.getBean("zomato",Zomato.class);
		
		System.out.println(fd.getHotelName());
		System.out.println(fd.getDiscountCoupan());
		System.out.println(fd.getMenuList());
		context.close();
	}

}
