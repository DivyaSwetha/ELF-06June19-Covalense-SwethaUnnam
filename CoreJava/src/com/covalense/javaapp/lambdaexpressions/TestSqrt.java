package com.covalense.javaapp.lambdaexpressions;

public class TestSqrt {

	public static void main(String[] args) {
		SquareRoot s = i -> {
			double k = Math.sqrt(i);

			return (int) k;
		};
		int res = s.square(4);
		System.out.println("square root is: "+res);
	}

}
