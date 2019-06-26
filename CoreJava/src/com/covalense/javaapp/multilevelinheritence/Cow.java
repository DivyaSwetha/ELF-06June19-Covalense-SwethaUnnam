package com.covalense.javaapp.multilevelinheritence;

import lombok.extern.java.Log;

@Log
public class Cow extends Animal {
	void eats() {
		log.info("Cow eats grass");
	}
}
