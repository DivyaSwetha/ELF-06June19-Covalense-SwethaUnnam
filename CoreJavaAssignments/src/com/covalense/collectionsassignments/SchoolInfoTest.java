package com.covalense.collectionsassignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.java.Log;

@Log
public class SchoolInfoTest {

	public static void main(String[] args) {
		ClassesInfo firstClass = new ClassesInfo();
		ClassesInfo secondClass = new ClassesInfo();
		ClassesInfo thirdClass = new ClassesInfo();

		ArrayList<Student> firstClassStudents = new ArrayList<Student>();
		ArrayList<Student> secondClassStudents = new ArrayList<Student>();
		ArrayList<Student> thirdClassStudents = new ArrayList<Student>();
		
		Student s1 = new Student("hari", 90, 1);
		Student s2 = new Student("bari", 80, 2);
		Student s3 = new Student("siri", 89, 3);

		firstClassStudents.add(s1);
		firstClassStudents.add(s2);
		firstClassStudents.add(s3);

		secondClassStudents.add(s1);
		secondClassStudents.add(s2);
		secondClassStudents.add(s3);

		thirdClassStudents.add(s1);
		thirdClassStudents.add(s2);
		thirdClassStudents.add(s3);

		firstClass.setSt(firstClassStudents);
		secondClass.setSt(secondClassStudents);
		thirdClass.setSt(thirdClassStudents);

		Map<Integer, ClassesInfo> map = new HashMap<>();
		map.put(1, firstClass);
		map.put(2, secondClass);
		map.put(3, thirdClass);
		
		log.info(""+map);

	}

}
