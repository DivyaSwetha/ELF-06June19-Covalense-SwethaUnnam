package com.covalense.javaapp.lambdaexpressions;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
public class Greater_predicate {

	public static void main(String[] args) {
		int[] b = { 2, 5, 9, 6, 4, 3 };

		Predicate<Integer> p=a->a>4;


		for (int i = 0; i < b.length; i++) {
			if (p.test(b[i])) {
				log.info("Elements gerater than 4: " + b[i]);
			}

		}

	}
}
