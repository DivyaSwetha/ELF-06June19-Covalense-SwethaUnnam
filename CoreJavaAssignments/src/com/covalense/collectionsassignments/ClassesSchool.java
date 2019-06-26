package com.covalense.collectionsassignments;

import java.util.ArrayList;

public class ClassesSchool {

	public ArrayList<Student> firstClass() {
		ArrayList<Student> al=new ArrayList<>();
		
		Student s1=new Student("sam",95,1);
		Student s2=new Student("neelu",95, 2);
		Student s3=new Student("divya", 95, 3);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		return al;
	}
	
	public ArrayList<Student> secondClass() {
		ArrayList<Student> al=new ArrayList<>();
		
		Student s1=new Student("hari",90,1);
		Student s2=new Student("bari",80, 2);
		Student s3=new Student("siri", 89, 3);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		return al;
	}
	
	public ArrayList<Student> thirdClass() {
		ArrayList<Student> al = new ArrayList<>();

		Student s1 = new Student("anu", 82, 1);
		Student s2 = new Student("sonu", 81, 2);
		Student s3 = new Student("rinu", 89, 3);

		al.add(s1);
		al.add(s2);
		al.add(s3);

		return al;
	}
}
