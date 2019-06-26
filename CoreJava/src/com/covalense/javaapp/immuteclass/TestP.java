package com.covalense.javaapp.immuteclass;

import lombok.extern.java.Log;

@Log
public class TestP {

	public static void main(String[] args) {
		Person p = new Person("Ram", 23);
		log.info("Name is: " + p.getName());
		log.info("Age is: " + p.getAge());

		Person p1 = new Person("seetha", 23);
		log.info("Name is: " + p1.getName());
		log.info("Age is: " + p1.getAge());
	}

}
