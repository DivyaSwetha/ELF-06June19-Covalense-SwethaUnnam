package com.covalense.javaapp.streams;


public class TestPenMethodRef {
	public static void main(String[] args) {
		Pen p = new Pen();
		Demo d = p::write;
		d.print(4);
	}
}
