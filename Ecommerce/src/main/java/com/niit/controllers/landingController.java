package com.niit.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.portal.models.Category;
import com.portal.models.Product;

@Controller
public class landingController extends BasicController{

    
	
	 @RequestMapping(value = "/landing", method = RequestMethod.GET)
	   public ModelAndView printLanding() {
	      Map<String, Object> model = getCategoriesForLanding();
	      model = getProductsLanding(model);
	      model.put("currentUser", get_current_user());
		  model.put("isAdmin", isAdmin());
		  System.out.println("In printHello");
	      model.put("message", "Hello Spring MVC Framework!");
	      return new ModelAndView("landing", model);
	   }
	 
	 /**
	  * This method will get the products list that are needed for the landing page and would send it to the model.
	  * @param model
	  * @return
	  */
	 public Map<String,Object> getProductsLanding(Map<String, Object> model){
		 ArrayList<Product> prodDealList = new ArrayList<Product>();
		 ArrayList<Product> prodFeatureList = new ArrayList<Product>();
		 List<Product> list_product = productDAOImpl.getProducts();
		 Collections.shuffle(list_product);
		 int i =0;
		 int length = list_product.size();
		 if(length>5) length = 5;
		 for(i=0;i<length;i++) prodDealList.add(list_product.get(i));
		 Collections.shuffle(list_product);
		 for(i=0;i<length;i++) prodFeatureList.add(list_product.get(i));
		 model.put("productsDealsList", prodDealList);
		 model.put("productsFeatureList", prodFeatureList);
		 for(Product disp: (ArrayList<Product>) model.get("productsDealsList")){
		    	System.out.println("productsDealsList__Id -> "+ disp.getId());
		    	System.out.println("productsDealsList__Name -> "+ disp.getName());
			 }
		 for(Product disp: (ArrayList<Product>) model.get("productsFeatureList")){
		    	System.out.println("productsFeatureList__Id -> "+ disp.getId());
		    	System.out.println("productsFeatureListt__Name -> "+ disp.getName());
			 }
		 
		 return model;
	 }
	 
	@SuppressWarnings("unchecked")
	public  Map<String, Object> getCategoriesForLanding(){
		 Map<String, Object> model = new HashMap<String, Object>();
		 Category category;
		 List<Category> list_categories =  categoryDAOImpl.getCategories();
		 HashMap<String, ArrayList<String>> categories_map = new HashMap<String,ArrayList<String>>();
		 ArrayList<String> values;
		 ArrayList<String> othercategories = new ArrayList<String>();
		 Iterator<Category> iterator = list_categories.iterator();
		 String key;
		 String value;
		 int i =0;
		 while (iterator.hasNext()) {
			 category = iterator.next();
		     key = category.getName();
			 value = category.getSubcategory();
			 values = categories_map.get(key);
			 if(!(values instanceof ArrayList<?>))values = new ArrayList<String>();
			 values.add(value);
			 categories_map.put(key, values);
			 System.out.println("key,value being added now is"+key+","+value+".");
		 }
		 Iterator<String> keySetIterator = categories_map.keySet().iterator();
		 while(keySetIterator.hasNext()){
		   String key_category = keySetIterator.next();
		   i = i + 1;
		   if(i>=1 && i<=3){ 
			   model.put("category"+i,categories_map.get(key_category));
			   model.put("category"+i+"Name",key_category);
		   } 
		   if(i>4) othercategories.add(key_category);
		  }	
		 //The below code is only for displaying the model.
		 model.put("othercategory",othercategories); 
		 System.out.println("Category 1 is "+ model.get("category1"));
		 System.out.println("Category 2 is "+ model.get("category2"));
		 System.out.println("Category 3 is "+ model.get("category3"));
		 System.out.println("Other Category is ");
		 for(String disp: (ArrayList<String>) model.get("othercategory")){
	    	System.out.println("Other category value -> "+ disp );
		 }
		  return model;
		 }
		 
		 
		 
		 
		
	}
	 


