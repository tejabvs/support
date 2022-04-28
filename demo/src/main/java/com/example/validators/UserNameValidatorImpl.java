package com.example.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserNameValidatorImpl implements ConstraintValidator<UserNameValidator, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value.length() % 2 == 0)
			return true;
		else
			return false;
	}

}
