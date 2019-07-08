package com.covalense.javaapp.array;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class ArraySort {

	public static void main(String[] args) {

		double[] a = { 3.2, 1.3, 5, 6.2, 4 };

		Arrays.sort(a);

		for (int i = 0; i <= a.length - 1; i++) {
			log.info(a[i] + " ");
		}
	}

}
