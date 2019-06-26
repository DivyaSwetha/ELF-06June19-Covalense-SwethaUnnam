package com.covalense.javaapp.practice;

import lombok.extern.java.Log;

@Log
public class Car {
	int speed = 45;
	MusicSystem m = new MusicSystem();

	void car() {
		log.info("I am car() from Car class");
	}
}
