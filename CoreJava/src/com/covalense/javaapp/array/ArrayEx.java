package com.covalense.javaapp.array;

import java.util.logging.Logger;

public class ArrayEx {
	private static final Logger log = Logger.getLogger("arrayex");

	public static void main(String[] args) {
		int[] a = new int[4];
		a[0] = 5;
		a[1] = 19;
		a[2] = 13;
		a[3] = 15;
		for (int i = 0; i < 4; i++) {
			log.info("value is:"+a[i]);
		}
	}

}
