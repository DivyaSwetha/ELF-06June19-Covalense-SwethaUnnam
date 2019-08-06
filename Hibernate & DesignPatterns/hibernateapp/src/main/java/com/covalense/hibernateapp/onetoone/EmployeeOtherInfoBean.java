package com.covalense.hibernateapp.onetoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name="EMPLOYEE_OTHERINFO")
public class EmployeeOtherInfoBean implements Serializable{
	@OneToOne
	//@Id
	//@JoinColumn(name="ID") (or) 
	@PrimaryKeyJoinColumn(name="ID")
	private EmployeeInfoBean empInfo;
	
	@Column(name="PAN")
	private String pan;
	
	@Column(name="ISMARRIED")
	private boolean ismarried;
	
	@Column(name="BLOOD_GRP")
	private String bloodGroup;
	
	@Column(name="ISCHALLENGED")
	private boolean ischallenged;
	
	@Column(name="EMERGENCY_CONTACT_NUMBER")
	private long emergencyContactNum;
	
	@Column(name="EMERGENCY_CONTACT_NAME")
	private String emergencyContactName;
	
	@Column(name="NATIONALITY")
	private String nationality;
	
	@Column(name="RELIGION")
	private String religion;
	
	@Column(name="FATHER_NM")
	private String fatherName;
	
	@Column(name="MOTHER_NM")
	private String motherName;
	
	@Column(name="SPOUSE_NM")
	private String spouseName;
	
	@Column(name="PASSPORT")
	private String passport;
	
	@Column(name="ADHAR")
	private long adhar;

}
