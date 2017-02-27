package com.niit.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.portal.models.Client;
 


@Component
public class AddressValidator {

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
		  Pattern notNumber = Pattern.compile("[^0-9]");
		  
		  if(notAlphaNumeric.matcher(uname).find() || uname.length()<3 || uname.length()>10) errors.rejectValue("uname", "uname.incorrect","Username should be Alpha Numeric and 3-10 characters.");		
		  if(notAlphaNumeric.matcher(firstname).find()) errors.rejectValue("firstname", "firstname.incorrect","firstname should be Alpha Numeric.");
		  if(notAlphaNumeric.matcher(lastname).find()) errors.rejectValue("lastname", "lastname.incorrect","lastname should be Alpha Numeric.");
		  if(notAlphaNumeric.matcher(middlename).find()) errors.rejectValue("middlename", "middlename.incorrect","middlename should be Alpha Numeric.");
		  if(!sex.equals("Male")||!sex.equals("Female")) errors.rejectValue("sex", "sex.incorrect","sex should only be Male or Female");
		  if(notNumber.matcher(personalphone).find()||!(personalphone.length()==10)) errors.rejectValue("personalphone", "personalphone.incorrect","Phone Number should be a 10 digit Number only.");
		  if(password.length()<=3 || password.length()>=11) errors.rejectValue("password", "password.incorrect","Password should be from 4 - 10 characters.");
		  if (!password.equals(confirmpassword)) {errors.rejectValue("confirmpassword", "password.mismatch","Passwords dont match."); }  
			 
	   }
	
	
	
	
	
	
	
	
	
	
	
	
}
