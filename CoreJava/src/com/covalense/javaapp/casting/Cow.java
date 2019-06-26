package com.covalense.javaapp.casting;

import lombok.extern.java.Log;

@Log
public class Cow extends Animal {
	int x;

	void walk() {
		log.info("walk()");
	}

	public static void main(String[] args) {

		Animal a = new Cow(); // first up-casting
		Cow c = (Cow) a; // then down-casting
		log.info("value is: " + c.i);
		c.eat();
		c.x = 15;
		log.info("value is: " + c.x);
		c.walk();
	}

}
