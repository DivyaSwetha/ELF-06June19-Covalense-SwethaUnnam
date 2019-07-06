package com.covalense.javaapp.studentspassed;

import lombok.Data;

@Data
public class StudentBean {

	private String name;
	private double percentage;
	private int rollNo;
	private char gender;

	public StudentBean(String name, double percentage, int rollNo, char gender) {
		super();
		this.name = name;
		this.percentage = percentage;
		this.rollNo = rollNo;
		this.gender = gender;
	}

}
