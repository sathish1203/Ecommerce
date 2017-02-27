package com.niit.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.portal.models.Client;
import com.portal.models.Product;
 


@Component
public class AdminProductValidator {

	   public boolean supports(Class<?> clazz) {
	        return Client.class.isAssignableFrom(clazz);
	    }	
	
	
	   public void validate(Object target, Errors errors) {
		   System.out.println("VALIDATE");
		   Product product = (Product)target;  
		   String id = product.getId();  
		   String name= product.getName();
		   String supplierid= product.getSupplierid();
		   String categoryid= product.getCategoryid();
		   String description= product.getDescription();
		   String mrp= product.getMrp();
		   String offerprice= product.getOfferprice();
		   String quantity= product.getQuantity();
		   String image_upload_path= product.getImage_upload_path();
			
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "error.id", "id is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "error.name", "name is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "supplierid", "error.supplierid", "supplierid is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "categoryid", "error.categoryid", "categoryid is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "error.description", "description is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mrp", "error.mrp", "mrp is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "offerprice", "error.offerprice", "offerprice is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "quantity", "error.quantity", "quantity is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "image_upload_path", "error.image_upload_path", "image_upload_path is required.");
		             
		  // Additional validations on length and type. 
		  Pattern notAlphaNumeric = Pattern.compile("[^a-zA-Z0-9]");
		  Pattern notNumber = Pattern.compile("[^0-9]");
		  
		  if(notAlphaNumeric.matcher(id).find() || id.length()<3 || id.length()>10) errors.rejectValue("id", "id.incorrect","id should be Alpha Numeric and 3-10 characters.");		
		  if(notAlphaNumeric.matcher(name).find()) errors.rejectValue("name", "name.incorrect","name should be Alpha Numeric.");
		  if(notAlphaNumeric.matcher(description).find()) errors.rejectValue("description", "description.incorrect","description should be Alpha Numeric.");
		  if(notNumber.matcher(mrp).find()) errors.rejectValue("mrp", "mrp.incorrect","mrp should be Numeric.");
		  if(notNumber.matcher(offerprice).find()) errors.rejectValue("offerprice", "offerprice.incorrect","offerprice should be Numeric.");
		  if(notNumber.matcher(quantity).find()) errors.rejectValue("quantity", "quantity.incorrect","quantity should be Numeric.");
				 
		   }
	
	
	
	
	
	
	
	
	
	
	
	
}
