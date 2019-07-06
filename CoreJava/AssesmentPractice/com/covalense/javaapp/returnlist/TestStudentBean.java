package com.covalense.javaapp.returnlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import lombok.extern.java.Log;

@Log
public class TestStudentBean {

	public static void main(String[] args) {

		StudentBean student1 = new StudentBean("Ram", 89, 1, 'M');
		StudentBean student2 = new StudentBean("Ramya", 32, 2, 'F');
		StudentBean student3 = new StudentBean("sam", 34, 3, 'M');

		ValidateList validate = new ValidateList();
		List<StudentBean> list = validate.check(1);
		list.add(student1);
		list.add(student2);
		list.add(student3);

		for (StudentBean studentBean : list) {
			log.info("" + studentBean);
		}

	}

}
