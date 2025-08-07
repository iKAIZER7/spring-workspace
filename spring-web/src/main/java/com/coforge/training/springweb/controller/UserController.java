package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
* Author :Vivek.Patel
* Date   :Jul 31, 2025
* Time   :10:42:46 AM
* Project:spring-web
*/
@Controller
public class UserController {
	@RequestMapping(value="/user",method=RequestMethod.GET)
      public String userInfo(ModelMap model) {

model.addAttribute("user", "Rod Jhonson");
		model.addAttribute("d", new java.util.Date());
		return "user"; // returns Model+view
		
	}
	
	@RequestMapping("/spring")
	public String showSecond() {
		return "second";
	}
}
