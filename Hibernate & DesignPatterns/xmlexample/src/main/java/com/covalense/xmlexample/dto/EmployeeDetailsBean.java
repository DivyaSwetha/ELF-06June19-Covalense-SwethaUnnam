package com.covalense.xmlexample.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
public class EmployeeDetailsBean {
	private int id;
	
	private String firstName;
	
	private String secondName;
	
	private int salary;
	

	private String jobType;
	
	private int deptNo;
	
	private String email;
}
