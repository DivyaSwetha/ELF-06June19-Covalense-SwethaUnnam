package com.covalense.javaapp.lambdaexpressions;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class Square_Function {

	public static void main(String[] args) {
		Function<Integer, Integer> f = r -> r * r;
		int square = f.apply(4);
		log.info("square of 4 is: " + square);

	}

}
