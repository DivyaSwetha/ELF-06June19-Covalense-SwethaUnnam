package com.covalense.javaapp.lambdaexpressions;

import java.util.function.Consumer;

import lombok.extern.java.Log;

@Log
public class Student_Consumer {

	public static void main(String[] args) {
		Student s1 = new Student("Ram", 98, 100, 95);

		Consumer<Student> c = s -> {
			double avg = (s.english + s.maths + s.science);
			log.info(s.name + " Average is: " + avg);
		};

		c.accept(s1);
	}
}