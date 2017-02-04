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

	
   // Mapping for the landing page
   @RequestMapping(value = "/landing",method = RequestMethod.GET)
   public String printLanding(ModelMap model) {
	  System.out.println("In printLanding");
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "landing2";
   }

   // Mapping for the login page
   @RequestMapping(value = "/login",method = RequestMethod.GET)
   public ModelAndView triggerLogin(ModelMap model) {
	  System.out.println("In triggerLogin method");
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return new ModelAndView("login", "command", new User());
   }
   
  // Mapping for the signup page
   @RequestMapping(value = "/signup",method = RequestMethod.GET)
   public ModelAndView triggerSignup(ModelMap model) {
	  System.out.println("In triggerSignup");
      return new ModelAndView("signup", "command", new User());
   }
 
   
   // Mapping for the addition of user
   @RequestMapping(value = "/addUser",method = RequestMethod.POST)
   public String addSignup(@ModelAttribute("SpringWeb")User user, 
		   ModelMap model) {
		 System.out.println("In addUsert");
			ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans.xml");
			HibernateSession db_session = (HibernateSession) context.getBean("h2_db_01");
			userAccess userAcc = new userAccess(db_session.getSessionFactory());
			System.out.println("user is "+ user);
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
		  model.addAttribute("user", "guest");
	      model.addAttribute("msg", "Registered Successfully, Please Login!!!");
	      return "landing2";
   }
   
  // Mapping for the logged user
   @RequestMapping(value = "/logged",method = RequestMethod.GET)
   public String triggerLogged(ModelMap model) {
	  System.out.println("In printLanding");
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "logged";
   }
   
   
   //Mapping for adding a new user
   @RequestMapping(value = "/user", method = RequestMethod.GET)
   public ModelAndView student() {
	   System.out.println("In User");
      return new ModelAndView("user", "command", new User());
   }

   
   
   
// @RequestMapping(value = "/addUser", method = RequestMethod.POST)
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

   
   
   //Mapping for validating a login request
   @RequestMapping(value = "/validateLogin", method = RequestMethod.POST)
   public ModelAndView loginUser(@ModelAttribute("SpringWeb")User user, 
	   ModelMap model) {
	   String ret_value = "error";
	   ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans.xml");
	   HibernateSession db_session = (HibernateSession) context.getBean("h2_db_01");
	   userAccess userAcc = new userAccess(db_session.getSessionFactory());
	   User foundUser = userAcc.getUserByUsername(user.getUname());
	   if(foundUser == null)
	   {
		   ret_value = "login";
		   model.addAttribute("user","guest");
		   model.addAttribute("msg","User does not exist");
		   System.out.println("User null");  
	   }else if(user.getPassword().equals(foundUser.getPassword()))
	   {
		   ret_value = "landing2";
		   model.addAttribute("user",user.getUname());
		   System.out.println("User validated");
		  
	   }else{
		   ret_value = "login";
		   model.addAttribute("user","guest");
		   model.addAttribute("msg","Invalid Credentials");
		   
		   System.out.println("User not validated");
	   }
	   System.out.println("In User");
	   ((AbstractApplicationContext) context).close();
	   return new ModelAndView(ret_value, "command", new User());
	  
   }

   
   
   
   
}