package com.covalense.javaapp.lambdaexpressions;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class String_Function {

	public static void main(String[] args) {
		Function<String, Integer> f = s -> {
			int x = s.length();
			return x;
		};

		int length = f.apply("swetha");
		log.info("length is: "+length);
	}

}
