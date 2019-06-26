package com.covalense.javaapp.polymorphism;
public class TestF {
	static Animal a;

	public static void main(String[] args) {
		a = new Cow();
		a.eat();
	}

}
