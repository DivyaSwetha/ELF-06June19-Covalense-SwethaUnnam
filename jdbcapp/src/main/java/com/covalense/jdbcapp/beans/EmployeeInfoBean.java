package com.covalense.jdbcapp.beans;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeInfoBean {
	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	private Date joining_date;
	private long account_number;
	private String email;
	private String designation;
	private Date dob;
	private int dept_id;
	private int mngr_id;

}
