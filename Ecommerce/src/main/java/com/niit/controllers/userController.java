package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.portal.models.User;


public class userController {
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	   public ModelAndView student() {
	      return new ModelAndView("user", "command", new User());
	   }
	
	 @RequestMapping(value = "/addUser", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("SpringWeb")User user, 
	   ModelMap model) {
		 
		 
		 
		 
	      model.addAttribute("firstname", user.getFirstname());
	      model.addAttribute("lastname", user.getLastname());
	      model.addAttribute("password", user.getPassword());
	      return "result";
	   }




}
