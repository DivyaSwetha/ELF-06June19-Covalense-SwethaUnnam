package com.covalense.hibernateapp;

import com.covalense.hibernateapp.dto.primary.EmployeeInfoBean;
import com.covalense.hibernateapp.model.HibernateImpl;

public class AppNew {

	public static void main(String[] args) {
		HibernateImpl impl=new HibernateImpl();
		EmployeeInfoBean infoBean=impl.getEmployeeInfoBean(1);
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(11);
		bean.setName("Teena");
		bean.setDesignation("SD");
		bean.setMngrId(infoBean);
		
		EmployeeInfoBean bean1 = new EmployeeInfoBean();
		bean1.setId(12);
		bean1.setName("Reena");
		bean1.setDesignation("SD");
		bean1.setMngrId(infoBean);
		
		EmployeeInfoBean bean2 = new EmployeeInfoBean();
		bean2.setId(13);
		bean2.setName("Meena");
		bean2.setDesignation("SD");
		bean2.setMngrId(infoBean);
		
		impl.createEmployee(bean1);
		impl.createEmployee(bean2);
	}

}
