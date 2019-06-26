package com.covalense.lambdaassignments;

import lombok.extern.java.Log;

@Log
public class TestSquare {

	public static void main(String[] args) {
		SquareEx s = a -> {
			return a * a;
		};
		int i = s.sqr(4);
		log.info("Square of the number is: " + i);
	}

}
