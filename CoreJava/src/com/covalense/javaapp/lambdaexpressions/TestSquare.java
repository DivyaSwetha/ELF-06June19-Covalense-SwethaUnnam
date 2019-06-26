package com.covalense.javaapp.lambdaexpressions;

public class TestSquare {

	public static void main(String[] args) {
		SquareEx s = a -> {
			return a * a;
		};
		int i = s.sqr(4);
		System.out.println("Square of the number is: "+i);
	}

}
