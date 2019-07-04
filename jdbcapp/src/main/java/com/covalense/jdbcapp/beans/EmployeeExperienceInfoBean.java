package com.covalense.jdbcapp.beans;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeExperienceInfoBean {
	private int id;
	private String company_name;
	private String designation;
	private Date joining_date;
	private Date leaving_date;

}
