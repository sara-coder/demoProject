package com.luv2code.springdemomvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class TeacherController {
	@RequestMapping("/teacher")
	public String showForm(Model theModel) {
		theModel.addAttribute("teacher", new Teacher());
		return "teacher-form";
	}
	

}
