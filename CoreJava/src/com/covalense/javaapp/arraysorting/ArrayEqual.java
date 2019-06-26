package com.covalense.javaapp.arraysorting;

import lombok.extern.java.Log;

@Log
public class ArrayEqual {

	public static void main(String[] args) {
		int[] a = { 9, 6, 2, 4 };
		int[] b = { 9, 6, 2, 4 };
		boolean clue = false;
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] != b[i]) {
				clue = true;
			} else {
				clue = false;
			}
		}
		if (clue == true) {
			log.info("a and b arrays are  equal");

		}

	}

}
