package com.covalense.hibernateapp.dto.primary;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "department_info")
public class DepartmentInfoBean implements Serializable{
	@Id
	@Column(name = "DEPT_ID")
	private int deptInfo;
	@Column(name = "DEPT_NAME")
	private String deptName;

}
