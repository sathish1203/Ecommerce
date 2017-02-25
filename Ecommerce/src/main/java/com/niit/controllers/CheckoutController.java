package com.niit.controllers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.portal.models.Cart;
import com.portal.models.CartProduct;
import com.portal.models.Client;
import com.portal.models.Product;


/**
 * This controller class will hold all the request methods for the CRUD
 * operations on the supplier.
 * 
 * @author Sathish1203
 *
 */
@Controller
public class CheckoutController extends BasicController {
	/**
	 * This method will add or update suppliers. It would first list all the
	 * suppliers and then allow user to add or update the suppliers. 
	 * 
	 * @param Supplier
	 *          -- The supplier value that is tagged to the model. The model form data object is passed to this method.
	 * @return 
	 *          -- Model and view data object  
	 */
	@RequestMapping(value = "/check_out", method = RequestMethod.GET)
	public ModelAndView add_checkout(@ModelAttribute("command") CartProduct cart_pdt) {
		Map<String, Object> model = new HashMap<String, Object>();
		String userName = get_current_user();
		model = addProductDetailsToCart(model,cartDAOImpl.parse_product_cart(userName));
		Client user = clientDAOImpl.getUserByUsername(userName);
		model.put("userDetails",user);
		return new ModelAndView("checkout", model);
	}
	
	/**
	 * This method will add or update suppliers. It would first list all the
	 * suppliers and then allow user to add or update the suppliers. 
	 * 
	 * @param Supplier
	 *          -- The supplier value that is tagged to the model. The model form data object is passed to this method.
	 * @return 
	 *          -- Model and view data object  
	 */
	@RequestMapping(value = "/save_check_out", method = RequestMethod.GET)
	public ModelAndView save_checkout(@ModelAttribute("command") CartProduct cart_pdt) {
		Map<String, Object> model = new HashMap<String, Object>();
		String userName = get_current_user();
		model = addProductDetailsToCart(model,cartDAOImpl.parse_product_cart(userName));
		Client user = clientDAOImpl.getUserByUsername(userName);
		model.put("userDetails",user);
		return new ModelAndView("checkout", model);
	}
	
}// End of the class
