package com.covalense.javaapp.aggregate;

import lombok.extern.java.Log;

@Log
public class Person {

	Mobile m = new Mobile();
	int i = 10;

	void walk() {
		log.info("Person wlking");
	}

}
