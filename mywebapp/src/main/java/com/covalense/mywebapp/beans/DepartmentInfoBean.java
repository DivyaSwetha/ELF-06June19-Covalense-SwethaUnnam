package com.covalense.mywebapp.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="department_info")
public class DepartmentInfoBean {
	private int dept_id;
	private String dept_name;

}
