package com.covalense.javaapp.inheritanceexamples;

import lombok.extern.java.Log;

@Log
public class Pen {
	void cost() {
		log.info("Cost is 100");
	}

	void write() {
		log.info("It writes well on paper");
	}
}
