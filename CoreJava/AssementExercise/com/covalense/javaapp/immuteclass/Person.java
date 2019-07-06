package com.covalense.javaapp.immuteclass;

public final class Person {
	public final String name;
	public final int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
