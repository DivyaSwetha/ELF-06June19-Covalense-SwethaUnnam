package com.covalense.javaapp.customexception;

import lombok.extern.java.Log;

@Log
public class StudentValidator {
	public void validate(Student s) throws InvalidMarksException {
		if (s.getPercentage() <= 50) {
			throw new InvalidMarksException();
		} else {
			log.severe("Hi"+s.getName() + " your are eligible for exam");
		}
	}
}
