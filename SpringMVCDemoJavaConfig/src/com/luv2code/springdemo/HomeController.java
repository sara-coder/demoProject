package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	public String showPage() {
		return "home";
	}

}
