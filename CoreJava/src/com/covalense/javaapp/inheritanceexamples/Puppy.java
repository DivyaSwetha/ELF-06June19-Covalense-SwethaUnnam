package com.covalense.javaapp.inheritanceexamples;

import lombok.extern.java.Log;

@Log
public class Puppy extends Dog {

	void milk() {
		log.info("Drinks milk");
	}

	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.eat();
		p.milk();
		p.sleep();
		p.eat();

		Dog d = new Dog();
		d.eat();
		d.sleep();
		d.sound();

		Animal a = new Animal();
		a.eat();
		a.sleep();

	}
}