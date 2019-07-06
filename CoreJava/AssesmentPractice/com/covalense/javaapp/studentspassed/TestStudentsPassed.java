package com.covalense.javaapp.studentspassed;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.covalense.javaapp.femalemaletopper.StudentBean;

import lombok.extern.java.Log;

@Log
public class TestStudentsPassed {

	public static void main(String[] args) {
		ArrayList<StudentBean> studentList = new ArrayList<StudentBean>();
		studentList.add(new StudentBean("Ram", 92, 1, 'M'));
		studentList.add(new StudentBean("Hari", 42, 2, 'M'));
		studentList.add(new StudentBean("Suri", 72, 3, 'M'));
		studentList.add(new StudentBean("Teena", 42, 4, 'F'));
		studentList.add(new StudentBean("Geetha", 62, 5, 'F'));
		studentList.add(new StudentBean("Seetha", 91, 6, 'F'));

		List<StudentBean> studentsPassed = studentList.stream().filter(i -> i.getPercentage()>40).collect(Collectors.toList());
		log.info("Passed Students are: " + studentsPassed);
	}

}
