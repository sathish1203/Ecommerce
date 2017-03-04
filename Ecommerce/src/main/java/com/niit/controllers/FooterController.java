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
	   @RequestMapping(value = "/all_help",method = RequestMethod.GET)
	   public ModelAndView triggerSignup() {
	      Map<String, Object> model = new HashMap<String, Object>();
	        model = getCategoriesForLanding(model);
			model.put("currentUser",get_current_user());
			  model.put("isAdmin", isAdmin());
		      model.put("message", "");
		  return new ModelAndView("/misc/help",model);
	   }
	 
	// Mapping for the signup page
	   @RequestMapping(value = "/all_about",method = RequestMethod.GET)
	   public ModelAndView triggerAbout() {
	      Map<String, Object> model = new HashMap<String, Object>();
	        model = getCategoriesForLanding(model);
			model.put("currentUser",get_current_user());
			 model.put("isAdmin", isAdmin());
		      model.put("message", "");
		  return new ModelAndView("/misc/about",model);
	   }
	 
	// Mapping for the signup page
	   @RequestMapping(value = "/all_policy",method = RequestMethod.GET)
	   public ModelAndView triggerPolicy() {
	      Map<String, Object> model = new HashMap<String, Object>();
	        model = getCategoriesForLanding(model);
			model.put("currentUser",get_current_user());
			 model.put("isAdmin", isAdmin());
		      model.put("message", "");
		  return new ModelAndView("/misc/policy",model);
	   }
	 
}