package com.covalense.javaapp.passingobjecttomethod;

public class TestPen {

	public static void main(String[] args) {
		Writer w = new Writer();
		Pen a = new Pen();
		w.recieve(a);
	}

}
