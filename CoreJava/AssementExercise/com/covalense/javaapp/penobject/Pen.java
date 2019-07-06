package com.covalense.javaapp.penobject;

import lombok.extern.java.Log;

@Log
public class Pen {

	Pen() {
		log.info("I am Zero param constructor");
	}

	void write() {
		log.info("I am write()");
	}
}
