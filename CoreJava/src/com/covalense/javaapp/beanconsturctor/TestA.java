package com.covalense.javaapp.beanconsturctor;

import lombok.extern.java.Log;

@Log
public class TestA {

	public static void main(String[] args) {

		Student s = new Student("Ram", 23, 5.6);
		Student p = new Student("Seetha", 22, 5.5);
		boolean b = s.equals(p);
		
		log.info("both are equal?: " + b);
		log.info("first student details are:" + s);
		log.info("Second student details are: " + p);
	}
}
