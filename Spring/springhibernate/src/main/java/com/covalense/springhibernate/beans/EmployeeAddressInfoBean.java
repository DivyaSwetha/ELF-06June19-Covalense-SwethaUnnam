package com.covalense.springhibernate.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_addressinfo")
public class EmployeeAddressInfoBean {
	@Id
	@Column(name="ID")
	private int id;
	@Id
	@Column(name="ADDRESS_TYPE")
	private String address_type;
	@Column(name="ADDRESS1")
	private String address1;
	@Column(name="ADDRESS2")
	private String address2;
	@Column(name="LANDMARK")
	private String landmark;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE")
	private String state;
	@Column(name="COUNTRY")
	private String country;
	@Column(name="PINCODE")
	private int pincode;

}
