package com.covalense.hibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.covalense.hibernateapp.manytoone.EmployeeEducationalPKBean;

import lombok.Data;

@Data
@Entity
@Table(name="employee_educational_info")
public class EmployeeEducationalInfo {
	@EmbeddedId
	private EmployeeEducationalPKBean empEducationInfo;
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
