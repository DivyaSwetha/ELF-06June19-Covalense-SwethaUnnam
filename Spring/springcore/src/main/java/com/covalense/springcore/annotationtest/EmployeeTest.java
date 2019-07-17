package com.covalense.springcore.annotationtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.beans.DepartmentBean;
import com.covalense.springcore.beans.EmployeeBean;
import com.covalense.springcore.configurations.EmployeeConfig;

import lombok.extern.java.Log;
@Log
public class EmployeeTest {

		public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employeeBean=context.getBean(EmployeeBean.class);
		log.info("EName: "+employeeBean.getName());
		log.info("Eid: "+employeeBean.getId());
		
		DepartmentBean departmentBean=employeeBean.getDepartmentBean();
		log.info("DName: "+departmentBean.getDeptName());
		log.info("DId: "+departmentBean.getDeptId());

	}

}
