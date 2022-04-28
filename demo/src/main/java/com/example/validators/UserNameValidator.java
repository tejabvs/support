package com.example.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = {UserNameValidatorImpl.class})
public @interface UserNameValidator {
	
	int age() default 0;
	String message() default "String is not of even length";
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
