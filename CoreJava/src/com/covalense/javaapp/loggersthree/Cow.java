package com.covalense.javaapp.loggersthree;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cow extends Animal {
	private static final Logger loger=Logger.getLogger("Animal");

void sound() {
	loger.log(Level.SEVERE, "cow says moooooooo");
	}
	void div(int a,int b) {
		int d=a/b;
		loger.severe("result is "+d);

		
	}
}
