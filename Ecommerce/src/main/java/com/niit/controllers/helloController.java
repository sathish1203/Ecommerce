package com.niit.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.portal.daos.HibernateSession;
import com.portal.models.User;

import portal.daos.modelDaos.userAccess;

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
   
   @RequestMapping(value = "/user", method = RequestMethod.GET)
   public ModelAndView student() {
	   System.out.println("In User");
      return new ModelAndView("user", "command", new User());
   }

 @RequestMapping(value = "/addUser", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("SpringWeb")User user, 
   ModelMap model) {
	 System.out.println("In addUsert");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans.xml");
		HibernateSession db_session = (HibernateSession) context.getBean("h2_db_01");
		userAccess userAcc = new userAccess(db_session.getSessionFactory());
		user.setUname("12345");
		userAcc.addUser(user);
		
		List<User> users = new ArrayList<User>();
		users= userAcc.getUsers();
		
		System.out.println("User is"+users);
		for (User user_l:users)
		{
			System.out.println("User is "+ user_l.getFirstname());
			System.out.println("Last name is "+ user_l.getLastname());
			
		}
		
		((AbstractApplicationContext) context).close();
	 
	 
      model.addAttribute("firstname", user.getFirstname());
      model.addAttribute("lastname", user.getLastname());
      model.addAttribute("password", user.getPassword());
      return "result";
   }



}