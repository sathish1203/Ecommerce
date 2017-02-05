package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.portal.models.Client;


@Controller
public class FooterController{

	

	// Mapping for the signup page
	   @RequestMapping(value = "/help",method = RequestMethod.GET)
	   public ModelAndView triggerSignup(ModelMap model) {
		  System.out.println("In triggerSignup");
	      return new ModelAndView("/misc/help", "command", new Client());
	   }
	 
   
   
}