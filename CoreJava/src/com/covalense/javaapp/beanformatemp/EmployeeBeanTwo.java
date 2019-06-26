package com.covalense.javaapp.beanformatemp;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data					//for automatic data
@AllArgsConstructor		//for parameterized constructor
@NoArgsConstructor		//for defalut constructor
public class EmployeeBeanTwo {

	private int id;
	private String name;
	private String department;
	private double salary;
	private int age;
	private Date joiningDate;
	private String gender;
	
  

}
