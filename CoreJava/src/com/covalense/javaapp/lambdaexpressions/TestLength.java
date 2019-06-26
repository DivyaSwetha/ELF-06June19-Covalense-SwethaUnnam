package com.covalense.javaapp.lambdaexpressions;

public class TestLength {

	public static void main(String[] args) {
		String str = "Ram";
		StringLength l = s -> s.length();
		int i = l.len(str);
		System.out.println("Length is: " + i);
	}

}
