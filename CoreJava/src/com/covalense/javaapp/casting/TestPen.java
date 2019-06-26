package com.covalense.javaapp.casting;

public class TestPen {

	public static void main(String[] args) {
		Pen p = new Marker(); // first up-casting
		Marker m = (Marker) p; // down-casting
		m.cost = 10;
		m.write();
		m.size = 11;
		m.color();

	}

}
