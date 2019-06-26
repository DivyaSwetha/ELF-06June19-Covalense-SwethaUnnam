package com.covalense.javaapp.inheritance.inheritanimal;

public class Person implements Animal,Human {

	public void eat() {
		System.out.println("Animal eats");
	}

	public void walks() {
		System.out.println("Human walks");
	}
}
