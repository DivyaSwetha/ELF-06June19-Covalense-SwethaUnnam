package com.covalense.hibernateapp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.covalense.hibernateapp.manytoone.EmployeeExperiencePKBean;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_experience_info")
public class EmployeeExperienceInfoBean {
	@EmbeddedId
	private EmployeeExperiencePKBean empPKBean;
	@Column(name = "DESIGNATION")
	private String designation;
	@Column(name = "JOINING_DATE")
	private Date joiningDate;
	@Column(name = "LEAVING_DATE")
	private Date leavingDate;

}
