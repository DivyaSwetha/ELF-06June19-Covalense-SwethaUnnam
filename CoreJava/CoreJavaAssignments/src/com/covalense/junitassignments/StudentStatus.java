package com.covalense.javaapp.junitassignments;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class StudentStatus {

	static Comparator<StudentBean> c = (i, j) -> {
		if (i.getPercentage() > j.getPercentage()) {
			return 1;
		} else if (i.getPercentage() < j.getPercentage()) {
			return -1;
		} else {
			return 0;
		}
	};

	static StudentBean getTopper(ArrayList<StudentBean> al) {

		return al.stream().max(c).get();

	}

	static StudentBean getPopper(ArrayList<StudentBean> al) {

		return al.stream().min(c).get();

	}

	public static void main(String[] args) {

		StudentBean student1 = new StudentBean("ram", 92, 1);
		StudentBean student2 = new StudentBean("ramya", 82.0, 82);
		StudentBean student3 = new StudentBean("sam", 85, 4);
		StudentBean student4 = new StudentBean("samla", 92, 3);
		StudentBean student5 = new StudentBean("ramu", 79, 2);

		ArrayList<StudentBean> studentList = new ArrayList<StudentBean>();

		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		studentList.add(student4);
		studentList.add(student5);

		StudentBean topper = StudentStatus.getTopper(studentList);
		log.info("topper is" + topper.getName() + "with percentage" + topper.getPercentage());

		StudentBean popper = StudentStatus.getPopper(studentList);
		log.info("Popper is " + popper.getName() + " with percentage " + popper.getPercentage());
	}

}
