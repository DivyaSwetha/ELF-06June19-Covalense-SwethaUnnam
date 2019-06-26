package com.covalense.javaapp.inheritance.practiceatmmachine;

public class TestATM {

	public static void main(String[] args) {
		Machine m = new Machine();
		ICICI i = new ICICI();
		HDFC h = new HDFC();
		SBI s = new SBI();
		m.type(s);
	}

}
