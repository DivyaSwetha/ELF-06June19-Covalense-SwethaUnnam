package com.covalense.hibernate.hibernateassessment.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "student_info")
public class StudentInfoBean {
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private StudentOtherBean otherInfo;
	@Id
	@Column(name = "rollNum")
	private int rollNum;
	@Column(name = "age")
	private int age;
	@Column(name = "name")
	private String name;
	@Column(name = "gender")
	private String gender;
	@Column(name = "emailId")
	private String emailId;
}
