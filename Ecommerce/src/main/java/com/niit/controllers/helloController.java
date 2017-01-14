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
   @RequestMapping(value = "/landing",method = RequestMethod.GET)
   public String printLanding(ModelMap model) {
	  System.out.println("In printLanding");
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "landing2";
   }
   @RequestMapping(value = "/login",method = RequestMethod.GET)
   public String triggerLogin(ModelMap model) {
	  System.out.println("In printLanding");
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "login";
   }
   @RequestMapping(value = "/signup",method = RequestMethod.GET)
   public String triggerSignup(ModelMap model) {
	  System.out.println("In printLanding");
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "signup";
   }
   @RequestMapping(value = "/logged",method = RequestMethod.GET)
   public String triggerLogged(ModelMap model) {
	  System.out.println("In printLanding");
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "logged";
   }
}