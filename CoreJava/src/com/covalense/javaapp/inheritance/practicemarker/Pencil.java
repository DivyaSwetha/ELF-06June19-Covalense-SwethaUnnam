package com.covalense.javaapp.inheritance.practicemarker;

import lombok.extern.java.Log;

@Log
public abstract class Pencil {
	void draw() {
		log.info("I am a draw()");
	}

	abstract void write();

	abstract void color();
}
