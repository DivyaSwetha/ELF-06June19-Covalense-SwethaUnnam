package com.covalense.javaapp.junitassignments;

import lombok.Data;

@Data
public class StudentBean {
	private String name;
	private double percentage;
	private int rollNo;

	public StudentBean(String name, double percentage, int rollNo) {
		super();
		this.name = name;
		this.percentage = percentage;
		this.rollNo = rollNo;
	}

}
