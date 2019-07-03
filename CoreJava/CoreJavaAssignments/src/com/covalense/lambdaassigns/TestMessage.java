package com.covalense.javaapp.lambdaassigns;

import lombok.extern.java.Log;

@Log
public class TestMessage {

	public static void main(String[] args) {
		Message m = ()-> {
			log.info("Hi How are you");

		};
		m.msg();
	}

}
