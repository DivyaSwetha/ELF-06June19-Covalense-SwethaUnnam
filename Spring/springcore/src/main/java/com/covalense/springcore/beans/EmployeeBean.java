package com.covalense.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class EmployeeBean{
	private int id;
	private String name;
	@Autowired
	@Qualifier("it")
	private DepartmentBean departmentBean;
	
	
	
	
	
	//init and destroy methods
	public void init() throws Exception {
		log.info("Initialization phase");
		
	}
	
	public void destroy() throws Exception {
		log.info("Destroy phase");
	}
}
