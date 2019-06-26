package com.covalense.javaapp.inheritance.practiceperson;

import lombok.extern.java.Log;

@Log
public class Person implements Animal, Human {

	public void eat() {
		log.info("Animal eats");
	}

	public void walks() {
		log.info("Human walks");
	}
}
