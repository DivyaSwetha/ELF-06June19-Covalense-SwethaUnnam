package com.covalense.javaapp.bean;

public class DBone {
	void recieve(Person p) {
		System.out.println("*******I am DB-1********");
		System.out.println("name is: " + p.getName());
		System.out.println("Age is: " + p.getAge());
	}
}
