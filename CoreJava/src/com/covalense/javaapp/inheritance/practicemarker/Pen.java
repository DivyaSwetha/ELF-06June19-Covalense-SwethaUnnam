package com.covalense.javaapp.inheritance.practicemarker;

import lombok.extern.java.Log;

@Log
public abstract class Pen extends Pencil {
	void write() {
		log.info("I am a write()");
	}
}
