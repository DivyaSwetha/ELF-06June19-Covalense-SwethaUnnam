package com.covalense.javaapp.streams;

import lombok.Data;

@Data
public class Student {
	private String name;
	private double percentage;
	private int rollNo;

	public Student(String name, double percentage, int rollNo) {
		super();
		this.name = name;
		this.percentage = percentage;
		this.rollNo = rollNo;
	}

}
