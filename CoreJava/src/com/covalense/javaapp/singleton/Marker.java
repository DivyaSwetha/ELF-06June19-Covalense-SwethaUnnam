package com.covalense.javaapp.singleton;

import lombok.extern.java.Log;

@Log
public class Marker {

	private final static Marker m = new Marker();

	private Marker() {
		log.info("Marker");
	}

	public static Marker getMarker() {
		return m;
	}
}
