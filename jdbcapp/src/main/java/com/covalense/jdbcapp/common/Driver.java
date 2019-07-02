package com.covalense.jdbcapp.common;

import lombok.extern.java.Log;

@Log
public class Driver implements Connection {

	@Override
	public void printMessage() {
		log.info("AAA");
	}

}
