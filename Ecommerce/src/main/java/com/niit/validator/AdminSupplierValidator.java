package com.niit.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.portal.models.Client;
import com.portal.models.Supplier;
 


@Component
public class AdminSupplierValidator {

	   public boolean supports(Class<?> clazz) {
	        return Client.class.isAssignableFrom(clazz);
	    }	
	
	
	   public void validate(Object target, Errors errors) {
		   System.out.println("VALIDATE");
		   Supplier supplier = (Supplier)target;  
		   String id = supplier.getId();
		   String name = supplier.getName();
		   String description = supplier.getDescription();
		  
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "error.id", "id is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "error.name", "name is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "error.description", "description is required.");
		  
		  // Additional validations on length and type. 
		  Pattern notAlphaNumeric = Pattern.compile("[^a-zA-Z0-9]");
		  
		  if(notAlphaNumeric.matcher(id).find() || id.length()<3 || id.length()>10) errors.rejectValue("id", "id.incorrect","id should be Alpha Numeric and 3-10 characters.");		
		  if(notAlphaNumeric.matcher(name).find()) errors.rejectValue("name", "name.incorrect","name should be Alpha Numeric.");
		  if(notAlphaNumeric.matcher(description).find()) errors.rejectValue("description", "description.incorrect","description should be Alpha Numeric.");
		  	 
	   }
	
	
	
	
	
	
	
	
	
	
	
	
}
