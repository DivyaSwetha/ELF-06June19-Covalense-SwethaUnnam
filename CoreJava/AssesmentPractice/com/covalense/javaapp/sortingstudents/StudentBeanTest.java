package com.covalense.javaapp.sortingstudents;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class StudentBeanTest {

	public static void main(String[] args) {
		Comparator<StudentBean> comparator = null;

		ArrayList<StudentBean> students = new ArrayList<>();
		students.add(new StudentBean("ram", 92.0, 1, 'M'));
		students.add(new StudentBean("seetha", 82.0, 2, 'F'));
		students.add(new StudentBean("lakshman", 72.0, 3, 'M'));

		int choice = 1;

		switch (choice) {
		case 1:
			comparator = (i, j) -> i.getName().compareTo(j.getName());
			break;
		case 2:
			comparator = (i, j) -> {
				if (i.getRollNo() > j.getRollNo()) {
					return 1;
				} else if (i.getRollNo() < j.getRollNo()) {
					return -1;
				} else {
					return 0;
				}

			};
			break;
		case 3:
			comparator = (i, j) -> {
				if (i.getPercentage() > j.getPercentage()) {
					return 1;
				} else if (i.getPercentage() < i.getPercentage()) {
					return -1;
				} else {
					return 0;
				}

			};
			break;
		default:
			log.info("Enter Valid Option");
		}

		List<StudentBean> studentsList = students.stream().sorted(comparator).collect(Collectors.toList());
		for (StudentBean studentBean : studentsList) {
			log.info("students are: " + studentBean);

		}

	}

}
