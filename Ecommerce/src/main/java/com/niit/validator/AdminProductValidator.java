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
			
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "error.id", "Id is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "error.name", "Name is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "supplierid", "error.supplierid", "Supplierid is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "categoryid", "error.categoryid", "Categoryid is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "error.description", "Description is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mrp", "error.mrp", "Mrp is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "offerprice", "error.offerprice", "Offerprice is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "quantity", "error.quantity", "Quantity is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "image_upload_path", "error.image_upload_path", "Image_upload_path is required.");
		             
		  // Additional validations on length and type. 
		  Pattern notAlphaNumeric = Pattern.compile("[^a-zA-Z0-9]");
		  Pattern notNumber = Pattern.compile("[^0-9]");
		  
		  if(notAlphaNumeric.matcher(id).find() || id.length()<3 || id.length()>10) errors.rejectValue("id", "id.incorrect","Id should be Alpha Numeric and 3-10 characters.");		
		  if(notAlphaNumeric.matcher(name).find()) errors.rejectValue("name", "name.incorrect","Name should be Alpha Numeric.");
		  if(notAlphaNumeric.matcher(description).find()) errors.rejectValue("description", "description.incorrect","Description should be Alpha Numeric.");
		  if(notNumber.matcher(mrp).find()) errors.rejectValue("mrp", "mrp.incorrect","Mrp should be Numeric.");
		  if(notNumber.matcher(offerprice).find()) errors.rejectValue("offerprice", "offerprice.incorrect","Offerprice should be Numeric.");
		  if(notNumber.matcher(quantity).find()) errors.rejectValue("quantity", "quantity.incorrect","Quantity should be Numeric.");
				 
		   }
	
	
	
	
	
	
	
	
	
	
	
	
}
