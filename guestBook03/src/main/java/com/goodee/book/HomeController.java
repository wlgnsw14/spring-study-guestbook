package com.goodee.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = {"","/"}, method=RequestMethod.GET)
	public String home() {
		// /WEB-INF/views/home.jsp
		return "home";
	}
	
}
