package com.covalense.javaapp.singleton;

public class Marker {
	private final static Marker m = new Marker();

	private Marker() {
		System.out.println("Marker");
	}

	public static Marker getMarker() {
		return m;
	}
}
