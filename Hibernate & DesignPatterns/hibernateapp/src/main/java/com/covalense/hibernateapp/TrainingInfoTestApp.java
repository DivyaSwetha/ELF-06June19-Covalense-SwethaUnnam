package com.covalense.hibernateapp;

import java.util.Arrays;

import com.covalense.hibernateapp.dto.primary.EmployeeInfoBean;
import com.covalense.hibernateapp.dto.TrainingInfoBean;
import com.covalense.hibernateapp.model.HibernateImpl;

public class TrainingInfoTestApp {

	public static void main(String[] args) {

		EmployeeInfoBean emp1=new EmployeeInfoBean();
		emp1.setId(7);
		emp1.setName("Ram");
		emp1.setAge(22);
		emp1.setDeptId(11);
		EmployeeInfoBean emp2=new EmployeeInfoBean();
		emp2.setId(8);
		emp2.setName("Seetha");
		emp2.setAge(22);
		emp2.setDeptId(11);
		EmployeeInfoBean emp3=new EmployeeInfoBean();
		emp3.setId(9);
		emp3.setName("Lakshman");
		emp3.setAge(22);
		emp3.setDeptId(11);
		
		TrainingInfoBean trainingInfo=new TrainingInfoBean();
		trainingInfo.setCourseType("FULL TIME");
		trainingInfo.setCourseId(103);
		trainingInfo.setCourseName("Java");
		trainingInfo.setDuration("60 days");
		trainingInfo.setEmpInfoBeans(Arrays.asList(emp1,emp2,emp3));
		
		HibernateImpl impl=new HibernateImpl();
		impl.employeeTrainingDetails(trainingInfo);
	}

}
