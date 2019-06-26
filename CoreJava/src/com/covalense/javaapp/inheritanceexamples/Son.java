package com.covalense.javaapp.inheritanceexamples;
import lombok.extern.java.Log;

@Log
public class Son extends Father {

	void bike() {
		log.info("Modified bike");
	}
}
