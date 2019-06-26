package com.covalense.javaapp.immuteclasstwo;

public final class Employee {
	public final String name;
	public final int age;
	public final double height;
	public final char gender;
	public final boolean status;

	public Employee(String name, int age, double height, char gender, boolean status) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public char getGender() {
		return gender;
	}

	public boolean isStatus() {
		return status;
	}

}
