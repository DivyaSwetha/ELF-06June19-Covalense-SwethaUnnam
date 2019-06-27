package com.covalense.javaapp.streams;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class TestStudentSort {

	static Comparator<Student> c = (i, j) -> {
		if (i.getPercentage() > j.getPercentage()) {
			return 1;
		} else if (i.getPercentage() < j.getPercentage()) {
			return -1;
		} else {
			return 0;
		}
	};

	static Student getTopper(ArrayList<Student> al) {

		return al.stream().max(c).get();

	}

	static Student getPopper(ArrayList<Student> al) {

		return al.stream().min(c).get();

	}

	public static void main(String[] args) {

		Student s1 = new Student("ram", 92, 1);
		Student s2 = new Student("ramya", 82, 5);
		Student s3 = new Student("sam", 85, 4);
		Student s4 = new Student("samla", 92, 3);
		Student s5 = new Student("ramu", 79, 2);

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		Student topper = TestStudentSort.getTopper(al);
		log.info("topper is" + topper.getName() + "with percentage" + topper.getPercentage());

		Student popper = TestStudentSort.getPopper(al);
		log.info("topper is " + popper.getName() + " with percentage " + popper.getPercentage());
	}

}
