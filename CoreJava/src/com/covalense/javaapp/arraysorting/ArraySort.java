package com.covalense.javaapp.arraysorting;

import java.util.Arrays;

import java.util.Collections;

import lombok.extern.java.Log;

@Log
public class ArraySort {

	public static void main(String[] args) {

		Integer[] a = { 3, 1, 5, 6, 4 };
		Arrays.sort(a); // for sorting

		for (int i = 0; i <= a.length - 1; i++) {
			log.info("element is: " + a[i]);
		}

		Arrays.sort(a, Collections.reverseOrder()); // for reverse sorting( have to use only wrapper classes thats why i
		// made my array type as Integer)
		for (int i = 0; i <= a.length - 1; i++) {
			log.info("element is: " + a[i]);
		}
	}

}
