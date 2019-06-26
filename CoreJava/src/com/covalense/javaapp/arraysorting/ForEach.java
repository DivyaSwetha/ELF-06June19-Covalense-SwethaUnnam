package com.covalense.javaapp.arraysorting;

import lombok.extern.java.Log;

@Log
public class ForEach {

	public static void main(String[] args) {

		int[] i = { 1, 2, 3, 4, 5 };
		double[] d = { 1.1, 2.2, 4.3 };
		String[] s = { "hi", "how", "are", "you" };
		char[] c = { 'h', 'a', 'p', 'p', 'y' };

		for (int a : i) {
			log.info("element is: " + a);
		}
		log.info("**********");

		for (double a : d) {
			log.info("element is: " + a);
		}
		log.info("**********");

		for (String a : s) {
			log.info(a);
		}
		log.info("**********");

		for (char a : c) {
			log.info("element is: " + a);
		}
	}

}
