package com.covalense.javaapp.basicoperations;

import lombok.extern.java.Log;

@Log
public class MulMethod {
	
	static int mul(int a, int b) {
		int c = a * b;
		return c;
	}

	public static void main(String[] args) {

		int res = mul(10, 20);
		log.info("multiplication is:" + res);
	}

}
