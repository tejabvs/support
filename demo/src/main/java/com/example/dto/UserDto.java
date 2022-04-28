package com.example.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.example.validators.UserNameValidator;

public class UserDto {

	@Size(min = 3, message = "User name should be minimum 3 character length")
	@NotBlank
	@UserNameValidator
	private String userName;

	private String password = "pass";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("setuserName called");
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("set password called");
		this.password = password;
	}

	public UserDto() {
		super();
		System.out.println("No arg constructor called");
	}

}
