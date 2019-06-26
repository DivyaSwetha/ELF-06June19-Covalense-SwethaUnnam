package com.covalense.javaapp.casting;

import lombok.extern.java.Log;

@Log
public class Marker extends Pen {
	double size = 10.5;

	void color() {
		log.info("I am color() in marker class");
	}
}
