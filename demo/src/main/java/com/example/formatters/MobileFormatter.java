package com.example.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.example.dto.Mobile;

public class MobileFormatter implements Formatter<Mobile> {

	@Override
	public String print(Mobile mob, Locale locale) {
		System.out.println("Mobile printer executed");
		return mob.toString();
	}

	@Override
	public Mobile parse(String text, Locale locale) throws ParseException {
		System.out.println("Mobile parser executed");
		String[] numbers = text.split("-");
		Mobile mob = new Mobile();
		mob.setCountryCd(numbers[0]);
		mob.setPrimaryNum(numbers[1]);
		return mob;
	}

}
