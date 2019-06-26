package com.covalense.javaapp.inheritanceexamples;

import lombok.extern.java.Log;

@Log
public class Dog extends Animal {
	void sound() {
		log.info("Dog barks");
	}

}
