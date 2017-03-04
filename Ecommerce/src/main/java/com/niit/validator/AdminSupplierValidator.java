package com.niit.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


import com.portal.models.Client;
import com.portal.models.Supplier;
 


@Component
public class AdminSupplierValidator implements Validator {

	   public boolean supports(Class<?> clazz) {
	        return Client.class.isAssignableFrom(clazz);
	    }	
	
	
	   public void validate(Object target, Errors errors) {
		   System.out.println("VALIDATE");
		   Supplier supplier = (Supplier)target;  
		   String id = supplier.getId();
		   String name = supplier.getName();
		   String description = supplier.getDescription();
		  
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "error.id", "Id is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "error.name", "Name is required.");
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "error.description", "Description is required.");
		  
		   
		  // Additional validations on length and type. 
		  Pattern notAlphaNumeric = Pattern.compile("[^a-zA-Z0-9\\s]");
		  
		  
		  if(notAlphaNumeric.matcher(id).find() || id.length()>10) errors.rejectValue("id", "id.incorrect","Id should be Alpha Numeric less than 10 characters.");		
		  if(notAlphaNumeric.matcher(name).find()) errors.rejectValue("name", "name.incorrect","Name should be Alpha Numeric.");
		  if(notAlphaNumeric.matcher(description).find()) errors.rejectValue("description", "description.incorrect","Description should be Alpha Numeric.");
		  	 
	   }
	
	
	
	
	
	
	
	
	
	
	
	
}
