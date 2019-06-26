package com.covalense.javaapp.exceptions;

import lombok.extern.java.Log;

@Log
public class TestB {

	public static void main(String[] args) {
		String s = "Ram";
		log.info("name you entered is:" + s);
		Validator v = new Validator();
		v.validate(s);

	}

}
