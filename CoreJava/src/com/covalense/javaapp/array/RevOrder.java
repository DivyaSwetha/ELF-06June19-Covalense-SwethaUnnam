package com.covalense.javaapp.array;

import java.util.logging.Logger;

public class RevOrder {
	private static final Logger log = Logger.getLogger("revorder");

	public static void main(String[] args) {
		int a[] = { 5, 10, 15, 20, 25 };
		for (int i = a.length - 1; i >= 0; i--) {
			log.info("value is:"+a[i]);
		}
	}

}
