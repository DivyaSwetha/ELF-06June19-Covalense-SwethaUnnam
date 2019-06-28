package com.covalense.javaapp.typeofobjects;

import lombok.extern.java.Log;

@Log
public class Dog extends Animal {
	
	public void eat() {
		log.info("Dog eats bones");
	}
}
