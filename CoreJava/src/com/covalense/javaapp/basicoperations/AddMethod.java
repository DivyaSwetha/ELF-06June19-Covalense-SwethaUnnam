package com.covalense.javaapp.basicoperations;

import lombok.extern.java.Log;

@Log
public class AddMethod {
	static int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		int res = add(10, 20);
		log.info("addition is:" + res);
	}
}
