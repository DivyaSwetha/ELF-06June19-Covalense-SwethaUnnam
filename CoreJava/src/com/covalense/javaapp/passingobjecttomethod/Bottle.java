package com.covalense.javaapp.passingobjecttomethod;

import lombok.extern.java.Log;

@Log
public class Bottle {
	void open() {
		log.info("Open the cap ");
	}

	void drink() {
		log.info("Drink the water");
	}
}
