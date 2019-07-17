package com.covalense.springcore.beans;

import com.covalense.springcore.interfaces.Animal;

import lombok.extern.java.Log;
@Log
public class Donkey implements Animal {

	@Override
	public void eat() {
		log.info("Donkey eats grass");
	}

	@Override
	public void makeSound() {
		log.info("Donkey sounds dhechu");
		
	}

}
