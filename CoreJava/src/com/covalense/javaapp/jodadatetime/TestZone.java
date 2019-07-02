package com.covalense.javaapp.jodadatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import lombok.extern.java.Log;

@Log
public class TestZone {

	public static void main(String[] args) {

		ZoneId z = ZoneId.systemDefault();
		log.info("current zone " + z);

		ZoneId t = ZoneId.of("Australia/Sydney");
		ZonedDateTime ze = ZonedDateTime.now(t);
		log.info("Australia/Sydney current time " + ze.toLocalDateTime());

	}

}
