package com.covalense.javaapp.exceptions;

import java.io.File;
import java.io.IOException;
import lombok.extern.java.Log;

@Log
public class PayTm extends ICRTC {

	void getTicket() throws IOException {
		log.info("getTicket started");
		File f = new File("Ram.txt");

		try {
			f.createNewFile();
		} catch (IOException i) {
			log.info("Exception caught in getTicket() of paytm");
			throw i;
		}

	}
}
