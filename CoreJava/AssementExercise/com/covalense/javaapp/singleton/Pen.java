package com.covalense.javaapp.singleton;

public class Pen {
	
	private final static Pen p = new Pen();

	private Pen() {
		System.out.println("pen");
	}

	public static Pen getPen() {
		return p;
	}
}
