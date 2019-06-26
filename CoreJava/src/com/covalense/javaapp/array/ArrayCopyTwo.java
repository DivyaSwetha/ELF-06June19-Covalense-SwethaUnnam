package com.covalense.javaapp.array;

import java.util.logging.Logger;

public class ArrayCopyTwo {
	private static final Logger log = Logger.getLogger("array2");

	public static void main(String[] args) {
		int atIndex = 2;
		int elements = 1;
		int a[] = { 5, 6, 2, 1, 4 };
		int b[] = { 30, 40, 50, 60, 70, 80 };
		int k = 0;
		for (int i = atIndex; i < b.length; i++) {
			if (k < elements) {
				b[i] = a[k++];
			} else {
				break;
			}
		}
		for (int i = 0; i < b.length; i++) {
			log.info("value is: "+b[i]);
		}
	}

}
