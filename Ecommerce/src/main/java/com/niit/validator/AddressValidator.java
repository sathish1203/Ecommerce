package com.niit.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.portal.models.Client;
 


@Component
public class AddressValidator {
	private static final String EMAIL_PATTERN =
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	   public boolean supports(Class<?> clazz) {
	        return Client.class.isAssignableFrom(clazz);
	    }	
	
	
	   public void validate(Object target, Errors errors) {
		  Client customer = (Client)target;  
		  String addressline1 = customer.getAddressline1();
		  String addressline2 = customer.getAddressline2();
		  String emailid = customer.getEmailid();
		  String state = customer.getState();
		   
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "addressline1", "error.addressline1", "User name name is required.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "addressline2", "error.addressline2", "First name is required.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailid", "error.emailid", "Last name is required.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "state", "error.state", "Middle name is required.");
		
		           
		  // Additional validations on length and type. 
		  Pattern notAlphaNumeric = Pattern.compile("[^a-zA-Z0-9]");
		  Pattern email = Pattern.compile(EMAIL_PATTERN);
		  
		  if(notAlphaNumeric.matcher(addressline1).find() || addressline1.length()<3 || addressline1.length()>20) errors.rejectValue("addressline1", "addressline1.incorrect","addressline1 should be Alpha Numeric and 3-20 characters.");		
		  if(notAlphaNumeric.matcher(addressline2).find()) errors.rejectValue("addressline2", "addressline2.incorrect","addressline2 should be Alpha Numeric.");
		  if(!email.matcher(emailid).find()) errors.rejectValue("emailid", "emailid.incorrect","emailid should be a valid email address.");
		  if(notAlphaNumeric.matcher(state).find()) errors.rejectValue("state", "state.incorrect","state should be Alpha Numeric.");
		 	 
	   }
	
	
	
	
	
	
	
	
	
	
	
	
}
