package com.covalense.javaapp.inheritance.practicemarker;

import lombok.extern.java.Log;

@Log
public class Marker extends Pen {
	void color() {
		log.info("I am a color()");
	}
}
