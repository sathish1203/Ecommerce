package com.niit.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.portal.daos.CategoryDAOImpl;
import com.portal.models.Category;

/**
 * This controller class will hold all the request methods for the CRUD
 * operations on the category.
 * 
 * @author Sathish1203
 *
 */

@Controller
public class AdminCategoryController {
	CategoryDAOImpl categoryDAOImpl = (CategoryDAOImpl) new ClassPathXmlApplicationContext("spring_beans.xml")
			.getBean("categoryDAOImpl");

	/**
	 * This method will add or update categories. It would first list all the
	 * categories and then allow user to add or update the categories. 
	 * 
	 * @param Category
	 *          -- The category value that is tagged to the model. The model form data object is passed to this method.
	 * @return 
	 *          -- Model and view data object  
	 */
	@RequestMapping(value = "/admin_add_category", method = RequestMethod.GET)
	public ModelAndView add_category(@ModelAttribute("command") Category category) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("categories", categoryDAOImpl.getCategories());
		return new ModelAndView("add_category", model);
	}

	
	/**
	 * This method will be used to save the category. This controller method
	 * would be invoked to save the admin category and then the add method would
	 * be called.
	 * 
	 * @param Category
	 *          -- The category value that is tagged to the model. The model form data object is passed to this method.
	 * @return 
	 *          -- Model and view data object 
	 */
	@RequestMapping(value = "/admin_save_category", method = RequestMethod.POST)
	public ModelAndView save_category(@ModelAttribute("command") Category category) {
		categoryDAOImpl.addCategory(category);
		return new ModelAndView("redirect:/admin_add_category");
	}

	
	/**
	 * This method will be used to edit the category. This controller method
	 * would be invoked to save the admin category and then the add method would
	 * be called.
	 * 
	 * @param Category
	 *          -- The category value that is tagged to the model. The model form data object is passed to this method.
	 * @return 
	 *          -- Model and view data object 
	 */
	@RequestMapping(value = "/admin_edit_category", method = RequestMethod.GET)
	public ModelAndView edit_category(@ModelAttribute("command") Category category) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("category", categoryDAOImpl.getCategoryById(category.getId()));
		model.put("categories", categoryDAOImpl.getCategories());
		return new ModelAndView("add_category", model);
	}

	
	/**
	 * This method will be used to delete the category. This controller method
	 * would be invoked to save the admin category and then the add page method
	 * would be called.
	 * 
	 * @param Category
	 *          -- The category value that is tagged to the model. The model form data object is passed to this method.
	 * @return 
	 *          -- Model and view data object 
	 */
	@RequestMapping(value = "/admin_delete_category", method = RequestMethod.GET)
	public ModelAndView delete_category(@ModelAttribute("command") Category category) {
		categoryDAOImpl.RemoveCategory(category);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("category", null);
		model.put("categories", categoryDAOImpl.getCategories());
		return new ModelAndView("add_category", model);
	}

	
}// End of the class
