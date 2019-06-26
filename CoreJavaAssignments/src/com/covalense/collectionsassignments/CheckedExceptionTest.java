package com.covalense.collectionsassignments;

public class CheckedExceptionTest {

	public static void main(String[] args) {

		int age = 16;
	AgeValidator v=new AgeValidator();
	try {
		v.validate(age);
	} catch (InvalidAgeException e) {
		e.printStackTrace();
	}

}
}
