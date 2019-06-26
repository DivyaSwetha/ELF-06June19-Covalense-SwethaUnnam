package com.covalense.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class MiPhone extends Phone {
	void says() {
		log.info("says Thank you Brother");
	}
}
