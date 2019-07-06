package com.covalense.javaapp.femalemaletopper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class StudentBeanTest {

	static Comparator<StudentBean> c = (i, j) -> {
		if (i.getPercentage() > j.getPercentage()) {
			return 1;
		} else if (i.getPercentage() < j.getPercentage()) {
			return -1;
		} else {
			return 0;
		}
	};

	public static void main(String[] args) {

		ArrayList<StudentBean> studentList = new ArrayList<StudentBean>();
		studentList.add(new StudentBean("Ram", 92, 1, 'M'));
		studentList.add(new StudentBean("Hari", 42, 2, 'M'));
		studentList.add(new StudentBean("Suri", 72, 3, 'M'));
		studentList.add(new StudentBean("Teena", 42, 4, 'F'));
		studentList.add(new StudentBean("Geetha", 62, 5, 'F'));
		studentList.add(new StudentBean("Seetha", 91, 6, 'F'));

		StudentBean femaleTopper = studentList.stream().filter(i -> i.getGender() == 'F').collect(Collectors.toList()).stream().max(c).get();
		log.info("Female Topper is: " + femaleTopper);
		
		StudentBean maleTopper = studentList.stream().filter(i -> i.getGender() == 'M').collect(Collectors.toList()).stream().max(c).get();
		log.info("male Topper is: " + maleTopper);

	}

}
