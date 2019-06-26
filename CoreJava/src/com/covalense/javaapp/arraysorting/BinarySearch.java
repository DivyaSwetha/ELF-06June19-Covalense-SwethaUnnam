package com.covalense.javaapp.arraysorting;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class BinarySearch {

	public static void main(String[] args) {

		int[] a = { 3, 1, 5, 6, 4 };
		Arrays.sort(a); // for sorting
		
		for (int i = 0; i <= a.length - 1; i++) {
			log.info("element is: " + a[i]);
		}
		
		int index = Arrays.binarySearch(a, 4);
		log.info("element is present at " + index + " index");
	}

}
