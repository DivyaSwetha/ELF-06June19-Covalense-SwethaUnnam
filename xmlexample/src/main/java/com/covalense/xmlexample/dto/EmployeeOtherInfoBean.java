package com.covalense.xmlexample.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EMPLOYEE_OTHERINFO")
public class EmployeeOtherInfoBean implements Serializable{
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="PAN")
	private String pan;
	
	@Column(name="ISMARRIED")
	private boolean ismarried;
	
	@Column(name="BLOOD_GRP")
	private String blood_grp;
	
	@Column(name="ISCHALLENGED")
	private boolean ischallenged;
	
	@Column(name="EMERGENCY_CONTACT_NUMBER")
	private long emergency_contact_number;
	
	@Column(name="EMERGENCY_CONTACT_NAME")
	private String emergency_contact_name;
	
	@Column(name="NATIONALITY")
	private String nationality;
	
	@Column(name="RELIGION")
	private String religion;
	
	@Column(name="FATHER_NM")
	private String father_nm;
	
	@Column(name="MOTHER_NM")
	private String mother_nm;
	
	@Column(name="SPOUSE_NM")
	private String spouse_nm;
	
	@Column(name="PASSPORT")
	private String passport;
	
	@Column(name="ADHAR")
	private long adhar;

}
