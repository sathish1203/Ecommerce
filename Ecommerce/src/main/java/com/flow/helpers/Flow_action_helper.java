package com.flow.helpers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;


import com.niit.controllers.BasicController;
import com.portal.models.Client;

@Component
public class Flow_action_helper extends BasicController{
	
	public Map<String, Object> populateDataCheckoutPage(String userName,Map<String, Object> model){
		model = addProductDetailsToCart(model,cartDAOImpl.parse_product_cart(userName));
		Client user = clientDAOImpl.getUserByUsername(userName);
		model.put("userDetails",user);
		model = getCategoriesForLanding(model);
		model.put("currentUser", get_current_user());
		
		return model;
	}
	
	
	public Map<String, Object> initializeMapModel(){
		Map<String, Object> model = new HashMap<String,Object>();
		return model ;
	}
	
	
	
	
}
