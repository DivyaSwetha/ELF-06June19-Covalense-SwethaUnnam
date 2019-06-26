package com.covalense.javaapp.inheritanceexamples;
public class TestInh {

	public static void main(String[] args) {
		ScientificCalculator Scal=new ScientificCalculator();
		Scal.add();
		Scal.sub();
		Scal.sin();
		Scal.cos();
		
		Calculator cal=new Calculator();
		cal.add();
		cal.sub();

	}

}
