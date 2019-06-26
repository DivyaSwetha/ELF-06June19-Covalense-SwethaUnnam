package com.covalense.javaapp.inheritanceexamples;

import lombok.extern.java.Log;

@Log
public class Animal {
	void eat() {
		log.info("It can eat");
	}

	void sleep() {
		log.info("It sleeps");
	}
}
