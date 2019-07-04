package com.covalense.javaapp.junitassignments;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class StudentStausTest {
	
	ArrayList<StudentBean> students = new ArrayList<StudentBean>();
	StudentBean student1 = new StudentBean("ram", 92.0, 1);
	StudentBean student2 = new StudentBean("sam", 85.0, 4);
	StudentBean student3 = new StudentBean("samla", 49.0, 3);
	StudentBean student4 = new StudentBean("ramu", 79.0, 2);
	StudentBean student5 = new StudentBean("ramya", 82.0, 5);

	@Test
	public void getTopperTest() {

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);

		StudentBean expected = student1;
		StudentBean actual = StudentStatus.getTopper(students);
		Assert.assertEquals(true, expected.equals(actual));
	}
	
	@Test
	public void getPopperTest() {

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);

		StudentBean expected = student3;
		StudentBean actual = StudentStatus.getPopper(students);
		Assert.assertEquals(true, expected.equals(actual));
}
}