package com.covalense.javaapp.customexception;

public class InvalidMarksException extends Exception {

	String str = " You are not eligible to write exam ";

	@Override
	public String toString() {
		return str;
	}

	@Override
	public String getMessage() {
		return str;
	}

}
