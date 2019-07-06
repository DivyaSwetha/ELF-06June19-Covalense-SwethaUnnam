package com.covalense.javaapp.snacks;

public class TestSnacks {

	public static void main(String[] args) {

		Snacks snacks=new Lays();
		Snacks snacks1=new Kurkure();
		Validate validate=new Validate();
		Snacks snacks2=validate.getSnacks(snacks1);
		snacks2.take();
		

		
	}

}
