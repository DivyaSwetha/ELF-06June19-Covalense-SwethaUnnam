package com.covalense.collectionsassignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import lombok.extern.java.Log;

@Log
public class SchoolTest {

	public static void main(String[] args) {

		ClassesSchool fc = new ClassesSchool();
		ClassesSchool sc = new ClassesSchool();
		ClassesSchool tc = new ClassesSchool();

		ArrayList<Student> first = fc.firstClass();
		ArrayList<Student> second = sc.secondClass();
		ArrayList<Student> third = tc.thirdClass();

		Map<Integer, ArrayList<Student>> m = new LinkedHashMap<>();

		m.put(1, first);
		m.put(2, second);
		m.put(3, third);

		log.info("School Details are: " + m);

	}

}
