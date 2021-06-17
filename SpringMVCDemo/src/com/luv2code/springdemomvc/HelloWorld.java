package com.luv2code.springdemomvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
@RequestMapping("/showForm")
 public String showForm() {
	 return "helloWorld";
 }
@RequestMapping("/processForm")
public String processForm() {
	 return "result";
}

@RequestMapping("/processForm2")
public String shoutOut(HttpServletRequest request, Model model) {
	// read from form
	request.getParameter("studentName");
	// convert to upppercase
	model.addAttribute("message", request.getParameter("studentName").toUpperCase());
	// add message
	return "result";
}
}
