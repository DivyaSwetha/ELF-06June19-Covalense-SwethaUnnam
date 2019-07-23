package com.covalense.hibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "department_info")
public class DepartmentInfoBean {
	@Id
	@Column(name = "DEPT_ID")
	private int dept_id;
	@Column(name = "DEPT_NAME")
	private String dept_name;

}
