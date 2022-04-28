package com.example.dto;

public class ContactDto {

	private String email = "abc@redif.com";
	private Mobile mobile;

	public String getEmail() {
		System.out.println("email called");
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Mobile getMobile() {
		System.out.println("mobile called");
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public ContactDto() {
		super();
		System.out.println("Contact constructor called");

	}

}
