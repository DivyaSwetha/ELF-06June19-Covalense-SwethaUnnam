package com.covalense.javaapp.overriding;

public class TestP {

	public static void main(String[] args) {
		Phone p = new MiPhone();
		Girl g = new Girl();
		g.recieve(p);

	}

}
