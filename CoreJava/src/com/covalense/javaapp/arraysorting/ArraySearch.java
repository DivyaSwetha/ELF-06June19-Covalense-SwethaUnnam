package com.covalense.javaapp.arraysorting;

import lombok.extern.java.Log;

@Log
public class ArraySearch {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		int toFind = 3;
		boolean found = false;

		for (int n : num) {
			if (n == toFind) {
				found = true;
				break;
			}
		}

		if (found)
			log.info(toFind + " is found.");
		else
			log.info(toFind + " is not found.");
	}

}
