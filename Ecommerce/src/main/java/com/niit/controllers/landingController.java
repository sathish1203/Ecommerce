package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class landingController {

    
	
	 @RequestMapping(value = "/landing", method = RequestMethod.GET)
	   public String printLanding(ModelMap model) {
		  System.out.println("In printHello");
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "landing2";
	   }
	 
	
	 

}
