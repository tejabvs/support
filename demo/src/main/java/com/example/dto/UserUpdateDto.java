package com.example.dto;

import javax.validation.constraints.Size;

public class UserUpdateDto {

	@Size(min = 3, message = "User name should be minimum 3 character length")
	private String userName;

	private String password = "pass";

	private String name;

	private ContactDto contact;

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

	public ContactDto getContact() {
		return contact;
	}

	public void setContact(ContactDto contact) {
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserUpdateDto() {
		super();
		System.out.println("No arg constructor called");
	}

}
