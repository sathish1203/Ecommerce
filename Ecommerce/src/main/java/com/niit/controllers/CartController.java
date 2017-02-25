package com.niit.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.portal.models.Cart;
import com.portal.models.CartProduct;
import com.portal.models.Supplier;

/**
 * This controller class will hold all the request methods for the CRUD
 * operations on the supplier.
 * 
 * @author Sathish1203
 *
 */

@Controller
public class CartController extends BasicController {
	/**
	 * This method will add or update suppliers. It would first list all the
	 * suppliers and then allow user to add or update the suppliers. 
	 * 
	 * @param Supplier
	 *          -- The supplier value that is tagged to the model. The model form data object is passed to this method.
	 * @return 
	 *          -- Model and view data object  
	 */
	@RequestMapping(value = "/add_cart", method = RequestMethod.GET)
	public ModelAndView add_Cart(@ModelAttribute("command") CartProduct cart_pdt) {
		Map<String, Object> model = new HashMap<String, Object>();
		String userName = get_current_user();
		model.put("currentUser", userName);
		Cart cart = cartDAOImpl.getCartById(userName);
		  if(cart == null){
		    	cart = new Cart();
				cart.setId(userName);	
		    	cart.setCount(0);
		    	cart.setCart(new String());
		    	cart.setName(userName);
		    	cartDAOImpl.addCart(cart);
		    	cart = cartDAOImpl.getCartById(userName);
		    }
		  model.put("cartpdt", cart_pdt);
	      model.put("cartpdts", cartDAOImpl.parse_product_cart(userName));
	      return new ModelAndView("add_cart", model);
	}
	
	/**
	 * This method will be used to save the supplier. This controller method
	 * would be invoked to save the admin supplier and then the add method would
	 * be called.
	 * 
	 * @param Supplier
	 *          -- The supplier value that is tagged to the model. The model form data object is passed to this method.
	 * @return 
	 *          -- Model and view data object 
	 */
	@RequestMapping(value = "/save_cart", method = RequestMethod.POST)
	public ModelAndView save_cart(@ModelAttribute("command") CartProduct cart_pdt) {
		String userName = get_current_user();
	    Cart cart;    
	    cart = cartDAOImpl.getCartById(userName);
	    cart.setCount(cart.getCount()+1);
	    String cart_new = cartDAOImpl.get_product_cart_string(userName,cart_pdt.getProductId(),cart_pdt.getQuantity());
	    System.out.println(cart_new);
	    cart.setCart(cart_new);
	    cartDAOImpl.addCart(cart);
	    return new ModelAndView("redirect:/add_cart");
	}

	
	/**
	 * This method will be used to edit the supplier. This controller method
	 * would be invoked to save the admin supplier and then the add method would
	 * be called.
	 * 
	 * @param Supplier
	 *          -- The supplier value that is tagged to the model. The model form data object is passed to this method.
	 * @return 
	 *          -- Model and view data object 
	 */
	@RequestMapping(value = "/edit_cart", method = RequestMethod.GET)
	public ModelAndView edit_cart(@ModelAttribute("command") CartProduct cart_pdt) {
		Map<String, Object> model = new HashMap<String, Object>();
	     model.put("currentUser", get_current_user());
		  model.put("cartpdt", cart_pdt);
	      model.put("cartpdts", cartDAOImpl.parse_product_cart(get_current_user()));
		return new ModelAndView("add_supplier", model);
	}

	
	/**
	 * This method will be used to delete the supplier. This controller method
	 * would be invoked to save the admin supplier and then the add page method
	 * would be called.
	 * 
	 * @param Supplier
	 *          -- The supplier value that is tagged to the model. The model form data object is passed to this method.
	 * @return 
	 *          -- Model and view data object 
	 */
	@RequestMapping(value = "/delete_cart", method = RequestMethod.GET)
	public ModelAndView delete_cart(@ModelAttribute("command") Supplier supplier) {
		supplierDAOImpl.RemoveSupplier(supplier);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("currentUser", get_current_user());
		model.put("supplier", null);
		model.put("suppliers", supplierDAOImpl.getSuppliers());
		return new ModelAndView("add_supplier", model);
	}

	
}// End of the class
