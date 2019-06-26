package com.covalense.javaapp.array;

import java.util.logging.Logger;

public class InitArray {
	private static final Logger log = Logger.getLogger("initialize");

	public static void main(String[] args) {
		int a[] = { 5, 10, 15, 20, 25 };
		for (int i = 0; i < a.length; i++) {
			log.info("value is:"+a[i]);
		}
	}

}
