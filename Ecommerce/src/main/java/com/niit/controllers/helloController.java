package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloController{

   @RequestMapping(value = "/hello",method = RequestMethod.GET)
   public String printHello(ModelMap model) {
	  System.out.println("In printHello");
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "hello";
   }

}