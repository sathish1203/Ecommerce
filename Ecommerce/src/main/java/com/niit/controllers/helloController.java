package com.niit.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.portal.models.Client;


@Controller
public class helloController extends BasicController {
	
	// Mapping for the login page
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView triggerLogin() {
		Map<String, Object> model = new HashMap<String, Object>();
		 model = getCategoriesForLanding(model);
		System.out.println("In Login method");
		model.put("currentUser", get_current_user());
		return new ModelAndView("login", model);
	}

	
	// Mapping for the signup page
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView triggerSignup(@ModelAttribute("command") Client client) {
		Map<String, Object> model = new HashMap<String, Object>();
		 model = getCategoriesForLanding(model);
		model.put("currentUser", get_current_user());
		System.out.println("In triggerSignup");
		return new ModelAndView("signup", model);
	}

	// Mapping for the addition of user
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ModelAndView addSignup(@ModelAttribute("command") Client client) {
		System.out.println("In addUser");
		System.out.println("user is " + client);
		Map<String, Object> model = new HashMap<String, Object>();
		model = getCategoriesForLanding(model);
		model.put("currentUser", get_current_user());
		clientDAOImpl.addUser(client);
	    model.put("msg", "Registered Successfully, Please Login!");
		return new ModelAndView("landing2", model);
	}

	// Mapping for the logged in user
	@RequestMapping(value = "/logged", method = RequestMethod.GET)
	public ModelAndView triggerLogged() {
		System.out.println("In printLanding");
		Map<String, Object> model = new HashMap<String, Object>();
		 model = getCategoriesForLanding(model);
		model.put("currentUser", get_current_user());
		return new ModelAndView("logged", model);
	}
}	
	
	
	
	
	
	/*
	 * 
	 * List<Client> clients = new ArrayList<Client>();
	clients = clientDAOImpl.getClients();
	System.out.println("User is" + clients);
	for (Client user_l : clients) {
		System.out.println("User is " + user_l.getFirstname());
		System.out.println("Last name is " + user_l.getLastname());

	}*
	*
	/
	/*
	 * // Mapping for the login page
	 * 
	 * @RequestMapping(value = "/hello",method = RequestMethod.GET) public void
	 * triggerHello(ModelMap model) {
	 * System.out.println("In triggerHello method");
	 * 
	 * }
	 * 
	 * 
	 * 
	 * //Mapping for adding a new user
	 * 
	 * @RequestMapping(value = "/user", method = RequestMethod.GET) public
	 * ModelAndView student() { System.out.println("In User"); return new
	 * ModelAndView("user", "command", new Client()); }
	 * 
	 */

	/*
	 * // Mapping for the landing page
	 * 
	 * @RequestMapping(value = "/landing",method = RequestMethod.GET) public
	 * String printLanding(ModelMap model) {
	 * System.out.println("In printLanding"); model.addAttribute("message",
	 * "Hello Spring MVC Framework!"); return "landing2"; }
	 * 
	 * 
	 * @RequestMapping(value = "/addUser", method = RequestMethod.POST) public
	 * String addStudent(@ModelAttribute("SpringWeb")Client client, ModelMap
	 * model) { System.out.println("In addUsert"); client.setUname("12345");
	 * clientDAOImpl.addUser(client); List<Client> clients = new
	 * ArrayList<Client>(); clients= clientDAOImpl.getClients();
	 * System.out.println("User is"+clients); for (Client user_l:clients) {
	 * System.out.println("User is "+ user_l.getFirstname());
	 * System.out.println("Last name is "+ user_l.getLastname());
	 * 
	 * } model.addAttribute("firstname", client.getFirstname());
	 * model.addAttribute("lastname", client.getLastname());
	 * model.addAttribute("password", client.getPassword()); return "result"; }
	 * 
	 */
	// Mapping for validating a login request
		/*@RequestMapping(value = "/validateLogin", method = RequestMethod.POST)
		public ModelAndView loginUser(@ModelAttribute("SpringWeb") Client client, ModelMap model) {
			String view = "error";
			boolean foundUser = clientDAOImpl.checkUsernamePassword(client.getUname(), client.getPassword());
			if (foundUser) {
				view = "landing2";
				model.addAttribute("user", client.getUname());
			
				System.out.println("User validated");
			} else {
				view = "login";
				model.addAttribute("user", "guest");
				model.addAttribute("msg", "Credentials Invalid. Either username or password is wrong.");
				System.out.println("User null");
			}
			return new ModelAndView(view, "command", new Client());
		}
*/
