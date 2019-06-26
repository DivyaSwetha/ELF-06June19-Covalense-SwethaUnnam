package com.covalense.javaapp.inheritanceexamples;

import lombok.extern.java.Log;

@Log
public class Marker extends Pen {
	void color() {
		log.info("Blue color");
	}

	public static void main(String[] args) {

		Pen p = new Marker();
		// we can call only parent specific members if we create object like this
		p.cost();
		Marker m = new Marker();
		// now we can access both parent and child specific members
		m.color();
		m.cost();
	}

}
