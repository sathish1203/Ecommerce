package com.niit.controllers;


import java.util.HashMap;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class landingController extends BasicController{

    
	
	 @RequestMapping(value = "/all_landing", method = RequestMethod.GET)
	   public ModelAndView printLanding() {
	      Map<String, Object> model = new  HashMap<String, Object>();
	      model = getCategoriesForLanding(model);
	      model = getProductsLanding(model);
	      model.put("currentUser", get_current_user());
		  model.put("isAdmin", isAdmin());
		  System.out.println("In printHello");
	      model.put("message", "Hello Spring MVC Framework!");
	      return new ModelAndView("landing", model);
	   }
	
	
		
	}
	 


