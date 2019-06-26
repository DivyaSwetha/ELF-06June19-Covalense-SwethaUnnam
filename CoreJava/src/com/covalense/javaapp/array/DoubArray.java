package com.covalense.javaapp.array;

import java.util.logging.Logger;

public class DoubArray {
	private static final Logger log = Logger.getLogger("doublearray");

	public static void main(String[] args) {
		double[] a = new double[4];
		a[0] = 5.5;
		a[1] = 19.4;
		a[2] = 13.3;
		a[3] = 15.2;
		for (int i = 0; i < a.length; i++) {
			log.info("value is:"+a[i]);
		}
	}
}
