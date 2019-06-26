package com.covalense.javaapp.inheritance.practiceatmmachine;

import lombok.extern.java.Log;

@Log
public class ICICI implements ATMmachine {
	public void validate() {
		log.info("validates user details from ICICI DB");
	}

	public void getInfo() {
		log.info("gets information of the user from ICICI DB");
	}

}
