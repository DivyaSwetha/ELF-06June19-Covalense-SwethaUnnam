package com.covalense.hibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_educational_info")
public class EmployeeEducationalInfo {
	@Id
	@Column(name="ID")
	private int id;
	@Id
	@Column(name="EDUCATION_TYPE")
	private String education_type;
	@Column(name="DEGREE_TYPE")
	private String degree_type;
	@Column(name="BRANCH")
	private String branch;
	@Column(name="COLLEGE_NM")
	private String college_nm;
	@Column(name="UNIVERSITY")
	private String university;
	@Column(name="YOP")
	private String yop;
	@Column(name="PERCENTAGE")
	private double percentage;
	@Column(name="LOCATION")
	private String location;

}
