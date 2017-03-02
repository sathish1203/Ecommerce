package com.flow.helpers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;


import com.niit.controllers.BasicController;
import com.portal.models.Client;
import com.portal.models.ViewData;

@Component
public class Flow_action_helper extends BasicController{
	
	public ViewData populateDataCheckoutPage(String userName,ViewData viewData){
		viewData.model = addProductDetailsToCart(viewData.model,cartDAOImpl.parse_product_cart(userName));
		Client user = clientDAOImpl.getUserByUsername(userName);
		viewData.setUserDetails(user);
		viewData.model = getCategoriesForLanding(viewData.model);
		viewData.model.put("currentUser", get_current_user());
		return viewData;
	}
	
	public void saveDataCheckoutPage(String userName,ViewData viewData){
		Client user = viewData.getUserDetails();
		System.out.println("user is "+user);
		Client user_db = clientDAOImpl.getUserByUsername(userName);
		user_db.setAddressline1(user.getAddressline1());
		user_db.setAddressline1(user.getAddressline2());
		user_db.setState(user.getState());
		user_db.setEmailid(user.getEmailid());
		clientDAOImpl.addUser(user_db);
	}
	
	public ViewData populateDataCheckoutConfirmedPage(String userName,ViewData viewData){
		
		Client user_db = clientDAOImpl.getUserByUsername(userName);
		viewData.model.put("userDetails",user_db);
		viewData.model = addProductDetailsToCart(viewData.model,cartDAOImpl.parse_product_cart(userName));
		viewData.model = getCategoriesForLanding(viewData.model);
		viewData.model.put("currentUser", get_current_user());
		return viewData;
	}
	
	public Map<String, Object> initializeMapModel(){
		Map<String, Object> model = new HashMap<String,Object>();
		return model ;
	}
	
	
	
	
}
