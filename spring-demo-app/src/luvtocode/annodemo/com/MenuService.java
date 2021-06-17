package luvtocode.annodemo.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class MenuService implements Menu {
	
	@Value("${hotel.foodPanda}")
	private String menuList; 
	
	@Override
	public String getMenu() {
		// TODO Auto-generated method stub
		return menuList;
	}

}
