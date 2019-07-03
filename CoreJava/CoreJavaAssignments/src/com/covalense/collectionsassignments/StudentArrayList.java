package com.covalense.collectionsassignments;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<Student>();

		Student s1 = new Student();
		s1.setName("Ram");
		s1.setPercentage(80);
		s1.setRollNo(1);

		Student s2 = new Student();
		s2.setName("seetha");
		s2.setPercentage(81);
		s2.setRollNo(2);

		Student s3 = new Student();
		s3.setName("Lakshman");
		s3.setPercentage(79);
		s3.setRollNo(3);

		Student s4 = new Student();
		s4.setName("hanuma");
		s4.setPercentage(85);
		s4.setRollNo(4);

		Student s5 = new Student();
		s5.setName("Bharatha");
		s5.setPercentage(71);
		s5.setRollNo(5);

		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);

		for (Student s : a) {
			log.info("name is: " + s.getName());
			log.info("Percentage is: " + s.getPercentage());
			log.info("Roll no is: " + s.getRollNo());
		}

	}

}
