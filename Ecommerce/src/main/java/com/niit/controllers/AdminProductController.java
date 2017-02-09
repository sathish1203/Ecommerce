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
import com.portal.daos.ProductDAOImpl;
import com.portal.daos.SupplierDAOImpl;
import com.portal.models.Product;

/**
 * This controller class will hold all the request methods for the CRUD
 * operations on the product.
 * 
 * @author Sathish1203
 *
 */

@Controller
public class AdminProductController {
	ProductDAOImpl productDAOImpl = (ProductDAOImpl) new ClassPathXmlApplicationContext("spring_beans.xml")
			.getBean("productDAOImpl");
	SupplierDAOImpl supplierDAOImpl = (SupplierDAOImpl) new ClassPathXmlApplicationContext("spring_beans.xml")
			.getBean("supplierDAOImpl");
	CategoryDAOImpl categoryDAOImpl = (CategoryDAOImpl) new ClassPathXmlApplicationContext("spring_beans.xml")
			.getBean("categoryDAOImpl");
	/**
	 * This method will add or update products. It would first list all the
	 * products and then allow user to add or update the products. 
	 * 
	 * @param Product
	 *          -- The product value that is tagged to the model. The model form data object is passed to this method.
	 * @return 
	 *          -- Model and view data object  
	 */
	@RequestMapping(value = "/admin_add_product", method = RequestMethod.GET)
	public ModelAndView add_product(@ModelAttribute("command") Product product) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("products", productDAOImpl.getProducts());
		model.put("suppliers", supplierDAOImpl.getSuppliers());
		model.put("categories", categoryDAOImpl.getCategories());
		return new ModelAndView("add_product", model);
	}

	
	/**
	 * This method will be used to save the product. This controller method
	 * would be invoked to save the admin product and then the add method would
	 * be called.
	 * 
	 * @param Product
	 *          -- The product value that is tagged to the model. The model form data object is passed to this method.
	 * @return 
	 *          -- Model and view data object 
	 */
	@RequestMapping(value = "/admin_save_product", method = RequestMethod.POST)
	public ModelAndView save_product(@ModelAttribute("command") Product product) {
		productDAOImpl.addProduct(product);
		return new ModelAndView("redirect:/admin_add_product");
	}

	
	/**
	 * This method will be used to edit the product. This controller method
	 * would be invoked to save the admin product and then the add method would
	 * be called.
	 * 
	 * @param Product
	 *          -- The product value that is tagged to the model. The model form data object is passed to this method.
	 * @return 
	 *          -- Model and view data object 
	 */
	@RequestMapping(value = "/admin_edit_product", method = RequestMethod.GET)
	public ModelAndView edit_product(@ModelAttribute("command") Product product) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("product", productDAOImpl.getProductById(product.getId()));
		model.put("products", productDAOImpl.getProducts());
		model.put("suppliers", supplierDAOImpl.getSuppliers());
		model.put("categories", categoryDAOImpl.getCategories());
		return new ModelAndView("add_product", model);
	}

	
	/**
	 * This method will be used to delete the product. This controller method
	 * would be invoked to save the admin product and then the add page method
	 * would be called.
	 * 
	 * @param Product
	 *          -- The product value that is tagged to the model. The model form data object is passed to this method.
	 * @return 
	 *          -- Model and view data object 
	 */
	@RequestMapping(value = "/admin_delete_product", method = RequestMethod.GET)
	public ModelAndView delete_product(@ModelAttribute("command") Product product) {
		productDAOImpl.RemoveProduct(product);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("product", null);
		model.put("products", productDAOImpl.getProducts());
		return new ModelAndView("add_product", model);
	}

	
}// End of the class
