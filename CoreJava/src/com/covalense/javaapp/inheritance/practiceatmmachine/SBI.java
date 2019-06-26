package com.covalense.javaapp.inheritance.practiceatmmachine;

import lombok.extern.java.Log;

@Log
public class SBI implements ATMmachine {
	
	public void validate() {
		log.info("validates user details from SBI DB");

	}

	public void getInfo() {
		log.info("gets information of the user from SBI DB");

	}

}
