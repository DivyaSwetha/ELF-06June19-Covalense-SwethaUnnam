package com.covalense.javaapp.soundofanimals;

import lombok.extern.java.Log;

@Log
public class Cat extends Animal {
	public void sound() {
		log.info("Cat says meoww");
	}
}
