package com.covalense.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class EmployeeBean{
	private int id;
	private String name;
	private DepartmentBean departmentBean;
	//init and destroy methods
	public void init() throws Exception {
		log.info("Initialization phase");
		
	}
	
	public void destroy() throws Exception {
		log.info("Destroy phase");
	}
}
