package com.covalense.javaapp.practice;

import lombok.extern.java.Log;

@Log
public class TestC {

	public static void main(String[] args) {
		Car c = new Car();
		log.info("speed of car: " + c.speed);
		c.m.freq = 98.5;
		log.info("freq of music system: " + c.m.freq);
		c.car();
		c.m.music();

	}

}
