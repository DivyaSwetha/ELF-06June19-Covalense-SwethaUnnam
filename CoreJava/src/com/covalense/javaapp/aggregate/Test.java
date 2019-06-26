package com.covalense.javaapp.aggregate;

import lombok.extern.java.Log;

@Log
public class Test {

	public static void main(String[] args) {
		Person p = new Person();
		p.m.call();
		log.info("value is: "+p.i);
	}

}
