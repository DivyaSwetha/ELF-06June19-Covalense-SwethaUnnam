package com.covalense.javaapp.lambdaexpressions;

import lombok.extern.java.Log;

@Log
public class Test_Add {
	static void add(int a,int b) {
		int c=a+b;
		log.info("result is: "+c);
	}

	public static void main(String[] args) {

		MyAddition a=Test_Add::add;
		a.sum(10, 15);
	}
}
