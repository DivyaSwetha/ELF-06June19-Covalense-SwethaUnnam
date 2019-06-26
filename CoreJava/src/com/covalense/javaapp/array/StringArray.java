package com.covalense.javaapp.array;

import java.util.logging.Logger;

public class StringArray {
	private static final Logger log = Logger.getLogger("stringarray");

	public static void main(String[] args) {
		String[] s = new String[3];
		s[0] = "raji";
		s[1] = "swetha";
		s[2] = "suri";
		log.info("length is: "+s.length);
		for (int i = 0; i < s.length; i++) {
			log.info(s[i]);
		}
	}

}
