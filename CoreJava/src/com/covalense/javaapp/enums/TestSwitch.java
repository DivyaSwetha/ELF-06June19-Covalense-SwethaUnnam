package com.covalense.javaapp.enums;

import lombok.extern.java.Log;

@Log
public class TestSwitch {

	public static void main(String[] args) {
		String s = "Dog";

		switch (s) {
		case "Apple":
			log.info("Hi Apple");
			break;
		case "Ball":
			log.info("Hi Ball");
			break;
		case "Car":
			log.info("Hi Car");
			break;
		default:
			log.info("Sorry wrong input");
			break;
		}
		
		
	}

}
