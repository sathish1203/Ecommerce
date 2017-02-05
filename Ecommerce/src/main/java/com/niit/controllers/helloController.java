package com.niit.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.portal.daos.ClientDAOImpl;
import com.portal.models.Client;


@Controller
public class helloController{
	ClientDAOImpl  clientDAOImpl  = (ClientDAOImpl) new ClassPathXmlApplicationContext("spring_beans.xml").getBean("clientDAOImpl");	
    

	

 /*  // Mapping for the landing page
   @RequestMapping(value = "/landing",method = RequestMethod.GET)
   public String printLanding(ModelMap model) {
	  System.out.println("In printLanding");
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "landing2";
   }*/

	 // Mapping for the login page
	   @RequestMapping(value = "/hello",method = RequestMethod.GET)
	   public void triggerHello(ModelMap model) {
		  System.out.println("In triggerHello method");
	     
	   }
	   
	
   // Mapping for the login page
   @RequestMapping(value = "/login",method = RequestMethod.GET)
   public ModelAndView triggerLogin(ModelMap model) {
	  System.out.println("In triggerLogin method");
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return new ModelAndView("login", "command", new Client());
   }
   
  // Mapping for the signup page
   @RequestMapping(value = "/signup",method = RequestMethod.GET)
   public ModelAndView triggerSignup(ModelMap model) {
	  System.out.println("In triggerSignup");
      return new ModelAndView("signup", "command", new Client());
   }
 
   
   // Mapping for the addition of user
   @RequestMapping(value = "/addUser",method = RequestMethod.POST)
   public String addSignup(@ModelAttribute("SpringWeb")Client client, 
		   ModelMap model) {
	     	System.out.println("In addUsert");
			System.out.println("user is "+ client);
			clientDAOImpl.addUser(client);
			List<Client> clients = new ArrayList<Client>();
			clients= clientDAOImpl.getClients();
			System.out.println("User is"+clients);
			for (Client user_l:clients)
			{
				System.out.println("User is "+ user_l.getFirstname());
				System.out.println("Last name is "+ user_l.getLastname());
				
			}
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
      return new ModelAndView("user", "command", new Client());
   }

   
   
   
// @RequestMapping(value = "/addUser", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("SpringWeb")Client client, 
   ModelMap model) {
	 System.out.println("In addUsert");
		client.setUname("12345");
		clientDAOImpl.addUser(client);
		List<Client> clients = new ArrayList<Client>();
		clients= clientDAOImpl.getClients();
		System.out.println("User is"+clients);
		for (Client user_l:clients)
		{
			System.out.println("User is "+ user_l.getFirstname());
			System.out.println("Last name is "+ user_l.getLastname());
			
		}
	  model.addAttribute("firstname", client.getFirstname());
      model.addAttribute("lastname", client.getLastname());
      model.addAttribute("password", client.getPassword());
      return "result";
   }

   
   
   //Mapping for validating a login request
   @RequestMapping(value = "/validateLogin", method = RequestMethod.POST)
   public ModelAndView loginUser(@ModelAttribute("SpringWeb")Client client, 
	   ModelMap model) {
	   String ret_value = "error";
	   Client foundUser = clientDAOImpl.getUserByUsername(client.getUname());
	   if(foundUser == null)
	   {
		   ret_value = "login";
		   model.addAttribute("user","guest");
		   model.addAttribute("msg","User does not exist");
		   System.out.println("User null");  
	   }else if(client.getPassword().equals(foundUser.getPassword()))
	   {
		   ret_value = "landing2";
		   model.addAttribute("user",client.getUname());
		   System.out.println("User validated");
		  
	   }else{
		   ret_value = "login";
		   model.addAttribute("user","guest");
		   model.addAttribute("msg","Invalid Credentials");
		   
		   System.out.println("User not validated");
	   }
	   System.out.println("In User");
	   return new ModelAndView(ret_value, "command", new Client());
	  
   }

   
   
   
   
}