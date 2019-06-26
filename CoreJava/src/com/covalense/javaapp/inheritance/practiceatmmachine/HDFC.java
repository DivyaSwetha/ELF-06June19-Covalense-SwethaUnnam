package com.covalense.javaapp.inheritance.practiceatmmachine;

import lombok.extern.java.Log;

@Log
public class HDFC implements ATMmachine {
	public void validate() {
		log.info("validates user details from HDFC DB");

	}

	public void getInfo() {
		log.info("gets information of the user from HDFC DB");

	}

}
