package com.spring.app.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.app.vo.User;

@Component
public class UserValidator implements Validator {

	public boolean supports(Class<?> classType) {
		return classType.isAssignableFrom(User.class);
	}

	public void validate(Object object, Errors errors) {
	User user=(User)object;
	if(user.getUserId()==null||user.getUserId().equals("")){
		errors.rejectValue("userId","userId.requeried");
	}
		
	}

}
