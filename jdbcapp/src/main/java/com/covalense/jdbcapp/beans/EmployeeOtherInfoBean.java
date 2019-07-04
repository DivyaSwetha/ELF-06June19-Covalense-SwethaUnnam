package com.covalense.jdbcapp.beans;

import lombok.Data;

@Data
public class EmployeeOtherInfoBean {
	
	private int id;
	private String pan;
	private boolean ismarried;
	private String blood_grp;
	private boolean ischallenged;
	private long emergency_contact_number;
	private String emergency_contact_name;
	private String nationality;
	private String religion;
	private String father_nm;
	private String mother_nm;
	private String spouse_nm;
	private String passport;
	private long adhar;

}
