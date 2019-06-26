package com.covalense.javaapp.array;

import java.util.logging.Logger;

public class ArrayCopy {
	private static final Logger log = Logger.getLogger("array");

	public static void main(String[] args) {

		int a[] = { 5, 6, 2, 1, 4 };
		int b[] = { 30, 40, 50, 60, 70, 80 };
		int k = 0;

		for (int i = 2; i < b.length; i++) {
			b[i] = a[k++];
		}
		for (int i = 0; i < b.length; i++) {
			log.info("value is: "+b[i]);
		}
	}

}
