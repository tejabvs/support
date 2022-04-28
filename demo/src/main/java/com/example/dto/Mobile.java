package com.example.dto;

public class Mobile {

	private String countryCd = "91";
	private String primaryNum = "9884346423";

	public String getPrimaryNum() {
		return primaryNum;
	}

	public void setPrimaryNum(String primaryNum) {
		this.primaryNum = primaryNum;
	}

	public String getCountryCd() {
		return countryCd;
	}

	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}

	public Mobile() {
		super();
		System.out.println("Mobile constructor called");

	}

	@Override
	public String toString() {
		return countryCd + "-" + primaryNum;
	}

}
