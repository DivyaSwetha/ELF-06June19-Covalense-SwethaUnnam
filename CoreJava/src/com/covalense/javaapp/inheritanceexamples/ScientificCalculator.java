package com.covalense.javaapp.inheritanceexamples;

import lombok.extern.java.Log;

@Log
public class ScientificCalculator extends Calculator {
	void sin() {
		log.info("Performing sin() operation");
	}

	void cos() {
		log.info("Performing cos() operation");
	}
}
