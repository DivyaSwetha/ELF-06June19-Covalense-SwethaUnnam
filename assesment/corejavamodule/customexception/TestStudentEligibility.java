package com.covalense.javaapp.customexception;

public class TestStudentEligibility {

	public static void main(String[] args) {

		Student s = new Student("Rani", 49, 1);
		StudentValidator sv = new StudentValidator();
		try {
			sv.validate(s);
		} catch (InvalidMarksException e) {
			e.printStackTrace();
		}

	}

}
