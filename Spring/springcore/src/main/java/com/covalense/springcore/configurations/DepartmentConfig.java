package com.covalense.springcore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.covalense.springcore.beans.DepartmentBean;
@Configuration
public class DepartmentConfig {
	//@Primary
	@Bean(name="it")
	public DepartmentBean getDeptIT() {
		DepartmentBean departmentBean= new DepartmentBean();
		departmentBean.setDeptId(11);
		departmentBean.setDeptName("Developer");
		return departmentBean;
	}
	
	@Bean(name="HR")
	public DepartmentBean getDeptHR() {
		DepartmentBean departmentBean= new DepartmentBean();
		departmentBean.setDeptId(12);
		departmentBean.setDeptName("HR");
		return departmentBean;
	}
	
	@Bean("Test")
	public DepartmentBean getDeptTest() {
		DepartmentBean departmentBean= new DepartmentBean();
		departmentBean.setDeptId(13);
		departmentBean.setDeptName("Tester");
		return departmentBean;
	}
}
