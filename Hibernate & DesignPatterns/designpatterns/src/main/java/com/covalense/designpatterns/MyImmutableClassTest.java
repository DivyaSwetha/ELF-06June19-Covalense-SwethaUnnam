package com.covalense.designpatterns;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {

	public static void main(String[] args) {

		MyImmutableClass immutableClass = null;

		immutableClass = new MyImmutableClass("ABC", 16, 91234567789L);
		log.info("Name is: " + immutableClass.getName());
		log.info("Age is: " + immutableClass.getAge());
		log.info("PhoneNo is: " + immutableClass.getPhone());
		
		immutableClass = new MyImmutableClass("XYZ", 18, 91234567789L);
		log.info("Name is: " + immutableClass.getName());
		log.info("Age is: " + immutableClass.getAge());
		log.info("PhoneNo is: " + immutableClass.getPhone());

	}// End of main

}// End of class
