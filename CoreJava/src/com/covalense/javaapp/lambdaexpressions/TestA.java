package com.covalense.javaapp.lambdaexpressions;

public class TestA {

	public static void main(String[] args) {
		Sum s = (a, b) -> a + b;
		int i = s.add(5, 1);
		System.out.println("Sum is: " + i);
	}

}
