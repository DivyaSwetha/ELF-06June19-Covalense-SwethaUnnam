package com.covalense.javaapp.lambdaexpressions;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class TestA_Predicate {

	public static void main(String[] args) {
		Predicate<Integer> p=a->a%2==0;
		boolean x=p.test(15);
		log.info(""+x);

	}

}
