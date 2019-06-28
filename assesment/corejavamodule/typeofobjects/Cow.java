package com.covalense.javaapp.typeofobjects;

import lombok.extern.java.Log;

@Log
public class Cow extends Animal {

	public void eat() {
		log.info("Cow eats grass");
	}

}
