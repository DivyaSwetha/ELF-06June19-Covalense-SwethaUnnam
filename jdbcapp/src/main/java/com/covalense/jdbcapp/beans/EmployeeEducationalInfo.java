package com.covalense.jdbcapp.beans;

import lombok.Data;

@Data
public class EmployeeEducationalInfo {
	private int id;
	private String education_type;
	private String degree_type;
	private String branch;
	private String college_nm;
	private String university;
	private String yop;
	private double percentage;
	private String location;

}
