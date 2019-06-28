package com.covalense.javaapp.customexception;

public class Student {
	private String name;
	private int percentage;
	private int id;

	public Student(String name, int percentage, int id) {
		super();
		this.name = name;
		this.percentage = percentage;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getPercentage() {
		return percentage;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", percentage=" + percentage + ", id=" + id + "]";
	}

}
