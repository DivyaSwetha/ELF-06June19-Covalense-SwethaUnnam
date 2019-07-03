package com.covalense.lambdaassignments;

import lombok.extern.java.Log;

@Log
public class TestMessage {

	public static void main(String[] args) {
		Message m = s -> {
			log.info("Hi How are you");

		};
		m.msg("hi");
	}

}
