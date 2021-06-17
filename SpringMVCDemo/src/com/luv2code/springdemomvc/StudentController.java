package com.luv2code.springdemomvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("student", new Student()) ;
		
		return "student-form";
	}
	@RequestMapping("/showForm1")
	public String showForm1(Model theModel) {
		theModel.addAttribute("student", new Student()) ;
		
		return "student-form";
	}
	@RequestMapping("/processForm")
	public String showForm(@ModelAttribute("student") Student theStudent) {
		
		return "studentdetail";
	}
}
