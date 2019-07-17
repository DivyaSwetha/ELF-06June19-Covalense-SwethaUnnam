package com.covalense.hibernate.hibernateassessment.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "students")
public class StudentBean implements Serializable{
	@Id
	@Column(name = "rollNum")
	private int rollNum;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "totalMarks")
	private double totalMarks;
}
