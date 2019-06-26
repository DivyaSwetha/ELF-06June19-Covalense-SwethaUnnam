package com.covalense.javaapp.singleton;

import lombok.extern.java.Log;

@Log
public class Pen {

	private final static Pen p = new Pen();

	private Pen() {
		log.info("pen");
	}

	public static Pen getPen() {
		return p;
	}
}
