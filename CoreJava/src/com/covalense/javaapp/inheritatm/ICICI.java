package com.covalense.javaapp.inheritance.inheritatm;

public class ICICI implements ATMmachine {
	public void validate() {
		System.out.println("validates user details from ICICI DB");
	}

	public void getInfo() {
		System.out.println("gets information of the user from ICICI DB");
	}

}
