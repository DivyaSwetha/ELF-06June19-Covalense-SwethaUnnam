package com.covalense.javaapp.lambdaexpressions;

public class Test_Pen {

	public static void main(String[] args) {
		PenFactory p = Pen::new;
		p.getPen();
	}

}
