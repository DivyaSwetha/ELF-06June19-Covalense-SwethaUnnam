package com.covalense.javaapp.streams;

import lombok.extern.java.Log;

@Log
public class TestPenLambda {
	public static void main(String[] args) {
		Demo d = x -> log.info("value is: " + x);
		d.print(4);
	}
}
