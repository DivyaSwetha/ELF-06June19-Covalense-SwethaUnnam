package com.covalense.designpatterns.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {

	public static void main(String[] args) throws ParseException {

		MyImmutableClass immutableClass = null;

		immutableClass = new MyImmutableClass("ABC", 16, 91234567789L);
		log.info("Name is: " + immutableClass.getName());
		log.info("Age is: " + immutableClass.getAge());
		log.info("PhoneNo is: " + immutableClass.getPhone());

		immutableClass = new MyImmutableClass("XYZ", 18, 91234567789L);
		log.info("Name is: " + immutableClass.getName());
		log.info("Age is: " + immutableClass.getAge());
		log.info("PhoneNo is: " + immutableClass.getPhone());
		

		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		Date dob=format.parse("1997-03-21");
		Date join=format.parse("2019-03-21");

		EmployeeData data = new EmployeeData(123, "Ram", 23, "male", 25000.0, 9878786543l, join,
				9382364728470l, "ram@gmail.com", "Software engineer", dob, 11, 111);
		log.info("Employee data: " + data.toString());
		
		EmployeeData2 data2=new EmployeeData2
								.EmployeeData2Builder()
								.id(456)
								.name("Seetha")
								.age(22)
								.gender("female")
								.salary(22000.0)
								.phone(9897387465l)
								.joiningDate(join)
								.accountNumber(465739562382l)
								.email("Seetha@gmail.com")
								.designation("Software engineer")
								.dob(dob)
								.departmentId(11)
								.managerId(111)
								.build();
		
		log.info("Employee data 2: " + data2.toString());

		EmployeeData3 data3=new EmployeeData3
								.EmployeeData3Builder()
								.id(456)
								.name("Seetha")
								.age(22)
								.gender("female")
								.salary(22000.0)
								.phone(9897387465l)
								.joiningDate(join)
								.accountNumber(465739562382l)
								.email("Seetha@gmail.com")
								.designation("Software engineer")
								.dob(dob)
								.departmentId(11)
								.managerId(111)
								.build();

log.info("Employee data 3: " + data3.toString());

	}// End of main

}// End of class
