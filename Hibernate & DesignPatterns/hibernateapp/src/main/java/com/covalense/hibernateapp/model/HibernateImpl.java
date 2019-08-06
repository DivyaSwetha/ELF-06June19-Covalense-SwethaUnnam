package com.covalense.hibernateapp.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeAddressInfoBean;
import com.covalense.hibernateapp.dto.EmployeeEducationalInfo;
import com.covalense.hibernateapp.dto.EmployeeExperienceInfoBean;
import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;
import com.covalense.hibernateapp.dto.TrainingInfoBean;
import com.covalense.hibernateapp.dto.primary.EmployeeInfoBean;

public class HibernateImpl {

	private Configuration config = new Configuration();
	private SessionFactory factory = config.configure().buildSessionFactory();
	
    //create Employee
	public void createEmployee(EmployeeInfoBean empInfo
							   , EmployeeOtherInfoBean empOther
							   , List<EmployeeAddressInfoBean> addressInfo
							   , List<EmployeeEducationalInfo> empEdu
							   ,List<EmployeeExperienceInfoBean> empExp) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(empInfo);
		session.save(empOther);
		//session.save(addressInfo);
		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressInfo) {
			session.save(employeeAddressInfoBean);
		}
		for(EmployeeEducationalInfo eduInfo:empEdu) {
			session.save(eduInfo);
		}
		for(EmployeeExperienceInfoBean empExpInfo:empExp) {
			session.save(empExpInfo);
		}
		transaction.commit();
		session.close();
	}//End of createEmployee()
	
	public void employeeTrainingDetails(TrainingInfoBean trainingInfo) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(trainingInfo);
		transaction.commit();
		session.close();
	}
	
	public EmployeeInfoBean getEmployeeInfoBean(int id) {
		Session session=factory.openSession();
		EmployeeInfoBean bean=session.get(EmployeeInfoBean.class, id);
		session.close();
		return bean;
	}
	public void createEmployee(EmployeeInfoBean empInfo) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(empInfo);
		transaction.commit();
		session.close();
	}
}//End of HibernateImpl
