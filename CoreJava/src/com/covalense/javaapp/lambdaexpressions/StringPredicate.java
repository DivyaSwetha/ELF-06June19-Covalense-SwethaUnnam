package com.covalense.javaapp.lambdaexpressions;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class String_Predicate {

	public static void main(String[] args) {
		
		Predicate<String> p = s -> s.length() >= 5;
		
		boolean x = p.test("Swetha");
		log.info(""+x);
	}

}
