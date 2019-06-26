package com.covalense.javaapp.loggersthree;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Lion extends Animal {
	
	private static final Logger loger = Logger.getLogger("Animal");

	void sound() {
		loger.log(Level.SEVERE, "Lion roars aaaaahhh");
	}

	void div(int a, int b) {
		int d = a / b;
		loger.log(Level.SEVERE, "result is " + d);

	}
}
