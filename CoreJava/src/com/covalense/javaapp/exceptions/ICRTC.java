package com.covalense.javaapp.exceptions;

import lombok.extern.java.Log;

@Log
public class ICRTC {

	void book() {
		log.info("I am book() from ICRTC class");
		try {
			log.info("result: " + (10 / 0));
		} catch (ArithmeticException a) {
			log.info("Exception caught in book()");
			throw a;
		}
		log.info("book ended");

	}

}
