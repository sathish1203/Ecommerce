package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.portal.models.Client;


public class userController {
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	   public ModelAndView student() {
	      return new ModelAndView("user", "command", new Client());
	   }
	
	 @RequestMapping(value = "/addUser", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("SpringWeb")Client client, 
	   ModelMap model) {
		  model.addAttribute("firstname", client.getFirstname());
	      model.addAttribute("lastname", client.getLastname());
	      model.addAttribute("password", client.getPassword());
	      return "result";
	   }




}
