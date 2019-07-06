package com.covalense.javaapp.soundofanimals;

import lombok.extern.java.Log;

@Log
public class Dog extends Animal {
	public void sound() {
		log.info("Dog says boww");
	}
}
