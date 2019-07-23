package com.covalense.springhibernate.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_experience_info")
public class EmployeeExperienceInfoBean {
	@Id
	@Column(name = "ID")
	private int id;
	@Id
	@Column(name = "COMPANY_NAME")
	private String company_name;
	@Column(name = "DESIGNATION")
	private String designation;
	@Column(name = "JOINING_DATE")
	private Date joining_date;
	@Column(name = "LEAVING_DATE")
	private Date leaving_date;

}
