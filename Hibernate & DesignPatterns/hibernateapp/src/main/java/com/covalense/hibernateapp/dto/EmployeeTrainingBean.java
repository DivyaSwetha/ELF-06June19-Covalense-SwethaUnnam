package com.covalense.hibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_training")
public class EmployeeTrainingBean {
	@Id
	@Column(name="ID")
	private int id;
	@Id
	@Column(name="COURSE_ID")
	private int course_id;

}
