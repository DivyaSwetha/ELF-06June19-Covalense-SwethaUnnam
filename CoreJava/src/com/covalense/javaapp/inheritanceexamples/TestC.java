package com.covalense.javaapp.inheritanceexamples;

public class TestC {

	public static void main(String[] args) {
		Father f = new Son();
		f.bike();
		Father fa = new Father();
		fa.bike();
	}

}
