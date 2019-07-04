package com.covalense.jdbcapp.beans;

import lombok.Data;

@Data
public class EmployeeAddressInfoBean {
	private int id;
	private String address_type;
	private String address1;
	private String address2;
	private String landmark;
	private String city;
	private String state;
	private String country;
	private int pincode;

}
