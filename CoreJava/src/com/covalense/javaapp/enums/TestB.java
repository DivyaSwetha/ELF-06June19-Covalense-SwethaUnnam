package com.covalense.javaapp.enums;

import lombok.extern.java.Log;

@Log
public class TestB {

	public static void main(String[] args) {

		try {

		} catch (ArithmeticException e) {
			log.info(e.getMessage());
		}
	}

}
