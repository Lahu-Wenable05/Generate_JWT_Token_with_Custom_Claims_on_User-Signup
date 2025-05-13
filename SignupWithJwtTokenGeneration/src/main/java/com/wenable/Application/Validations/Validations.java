package com.wenable.Application.Validations;

import org.springframework.stereotype.Component;

import com.wenable.Application.customException.UserException;

@Component
public class Validations {

	public boolean isValidEmail(String email) {
		if (email == null) {
			throw new UserException("Email cannot be null");
		}
  
		String regex = "^[a-z0-9+_.-]+@[a-z0-9.-]+\\.[a-z]{2,6}$";

		if (!email.matches(regex)) {   
			throw new UserException("Invalid e-mail.. It must be in valid format..");
		} 
		return true;
	}

	public boolean isValidPassword(String password) {
	    if ((password == null) || !(password.length() < 8)) {
	        throw new UserException("Password must be at least 8 alphanumeric characters.");
	    } else {
	        return true;
	    }
	}

}
