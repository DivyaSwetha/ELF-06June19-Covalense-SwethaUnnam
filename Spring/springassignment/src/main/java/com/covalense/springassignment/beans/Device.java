package com.covalense.springassignment.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.springassignment.interfaces.Laptop;

import lombok.Data;
@Data
public class Device {
	
	@Autowired
	private Laptop laptop;
}
