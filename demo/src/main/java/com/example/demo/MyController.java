package com.example.demo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dto.ContactDto;
import com.example.dto.Mobile;
import com.example.dto.UserDto;
import com.example.dto.UserUpdateDto;

@Controller
public class MyController {

	@RequestMapping("/m1")
	public String m2(@ModelAttribute("user") UserDto userdto) {
		return "login";
	}

	@RequestMapping("/processData")
	public String m3(@Valid @ModelAttribute("user") UserDto userdto, BindingResult result) {

		if (result.hasErrors()) {
			System.out.println("Error occured");
			return "login";
		}
		System.out.println("No Error occured");
		return "process";
	}

	@RequestMapping("/modifyData")
	public String m4(@ModelAttribute("userupdate") UserUpdateDto userdto) {
		System.out.println("Modify endpoint invoked ");

		Mobile m = new Mobile();
		ContactDto contact = new ContactDto() ;
		contact.setMobile(m);
		userdto.setContact(contact);
		return "user-update";
	}
	
	@RequestMapping("/processUpdatedData")
	public String m5(@ModelAttribute("userupdate") UserUpdateDto userdto) {

		return "confirmation";
	}
}