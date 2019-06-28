package com.covalense.javaapp.typeofobjects;

import lombok.extern.java.Log;

@Log
public class Lion extends Animal {
	public void eat() {
		log.info("Lion eats meat");
	}
}
