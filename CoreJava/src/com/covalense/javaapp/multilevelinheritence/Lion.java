package com.covalense.javaapp.multilevelinheritence;

import lombok.extern.java.Log;

@Log
public class Lion extends Animal {
	void eats() {
		log.info("Lion eats Meat");
	}
}
