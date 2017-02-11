package com.niit.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class FooterController extends BasicController{

	

	// Mapping for the signup page
	   @RequestMapping(value = "/help",method = RequestMethod.GET)
	   public ModelAndView triggerSignup() {
	      Map<String, Object> model = new HashMap<String, Object>();
			model.put("currentUser",get_current_user());
		  return new ModelAndView("/misc/help",model);
	   }
	 
   
   
}