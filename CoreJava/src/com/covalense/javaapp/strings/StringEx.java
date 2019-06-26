package com.covalense.javaapp.strings;

import lombok.extern.java.Log;

@Log
public class StringEx {

	public static void main(String[] args) {
		String a = "Dimple";
		String b = "dimple";
		int size = a.length(); // length() returns number of characters in a string
		log.info("size is: " + size);
		boolean bo = a.equals(b);
		log.info(""+bo);
	}

}
