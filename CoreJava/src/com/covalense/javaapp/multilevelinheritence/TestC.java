package com.covalense.javaapp.multilevelinheritence;
public class TestC {

	public static void main(String[] args) {
		Animal a;
		a=new Man();
		a.eats();
		a=new Lion();
		a.eats();

	}

}
