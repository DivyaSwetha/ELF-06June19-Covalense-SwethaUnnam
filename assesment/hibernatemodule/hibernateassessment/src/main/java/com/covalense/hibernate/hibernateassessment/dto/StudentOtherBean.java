package com.covalense.hibernate.hibernateassessment.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "student_other")
public class StudentOtherBean {
	@Id
	@Column(name = "rollNum")
	private int rollNum;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "religion")
	private String religion;
	@Column(name = "nationality")
	private String nationality;
	
}
