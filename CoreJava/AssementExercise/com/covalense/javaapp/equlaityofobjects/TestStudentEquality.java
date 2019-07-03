package com.covalense.javaapp.equlaityofobjects;

import lombok.extern.java.Log;

@Log
public class TestStudentEquality {
	
	public static void main(String[] args) {
		
		Student st1 = new Student("Ram", 92, 1);
		Student st2 = new Student("Ramya", 92, 1);
		Student st3 = new Student("Ram", 92, 1);

		boolean b = st1.equals(st3);
		log.info("are " + st1.getName() + " and " + st3.getName() + " equal:  " + b);
		
		boolean c = st1.equals(st2);
		log.info("are " + st1.getName() + " and " + st2.getName() + " equal:  " + c);

	}
}
