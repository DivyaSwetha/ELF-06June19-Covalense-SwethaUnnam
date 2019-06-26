package com.covalense.javaapp.array;

import java.util.logging.Logger;

public class NameArray {
	private static final Logger log = Logger.getLogger("namearray");

	public static void main(String[] args) {
		char[] c = new char[6];
		c[0] = 'S';
		c[1] = 'w';
		c[2] = 'e';
		c[3] = 't';
		c[4] = 'h';
		c[5] = 'a';
		log.info("length is:"+c.length);
		for (int i = 0; i < c.length; i++) {
			log.info("value is:"+c[i]);
		}
	}

}
