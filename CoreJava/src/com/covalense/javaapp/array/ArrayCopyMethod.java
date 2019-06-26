package com.covalense.javaapp.array;

import java.util.logging.Logger;

public class ArrayCopyMethod {
	private static final Logger log = Logger.getLogger("arraym");

	public static void main(String[] args) {
		int a[] = { 5, 6, 2, 1, 4 };
		int b[] = { 30, 40, 50, 60, 70, 80 };
		System.arraycopy(a, 2, b, 2, 3); // System.arrayCopy(sourceArray,
											// sourceArrayIndex,destinationArray,DestinationArrayIndex, no of elements
											// from sourceArray);
		for (int i = 0; i < b.length; i++) {
			log.info("value is:"+b[i]);
		}
	}

}
