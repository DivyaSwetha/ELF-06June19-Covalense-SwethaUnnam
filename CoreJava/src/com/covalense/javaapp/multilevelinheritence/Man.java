package com.covalense.javaapp.multilevelinheritence;

import lombok.extern.java.Log;

@Log
class Man extends Animal {
	void eats() {
		log.info("Man eats Burger");
	}
}
