package com.covalense.javaapp.basicoperations;

import java.util.logging.Logger;

public class LargestOfThree {

	private static final Logger log = Logger.getLogger("mylogger");

	public static void main(String[] args) {
		int a = 4;
		int b = 8;
		int c = 6;

		if ((a > b) && (a > c)) {
			log.info(a + " is greater than " + b + " and " + c);
		} else if (b > c) {
			log.info(b + " is greater than " + a + " and " + c);
		} else {
			log.info(c + " is greater than " + a + " and " + b);

		}

	}
}
