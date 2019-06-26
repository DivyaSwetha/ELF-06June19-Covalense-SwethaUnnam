package com.covalense.javaapp.array;

import java.util.logging.Logger;

public class ArrayCopyThree {
	private static final Logger log = Logger.getLogger("array3");

	public static void main(String[] args) {
		int sourceIndex = 2;
		int atIndex = 2;
		int elements = 3;
		int counter = 1;
		int a[] = { 5, 6, 2, 1, 4 };
		int b[] = { 30, 40, 50, 60, 70, 80 };
		for (int i = atIndex; i < b.length; i++) {
			b[i] = a[sourceIndex++];

			if (counter == elements) {
				break;

			}
			counter++;

		}
		for (int i = 0; i < b.length; i++) {
			log.info("value is: "+b[i]);
		}
	}
}
