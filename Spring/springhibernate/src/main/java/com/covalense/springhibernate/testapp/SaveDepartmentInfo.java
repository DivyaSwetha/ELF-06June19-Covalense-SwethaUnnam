package com.covalense.springhibernate.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springhibernate.beans.DepartmentInfoBean;
import com.covalense.springhibernate.configuration.HibernateConfig;


public class SaveDepartmentInfo {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory=context.getBean(SessionFactory.class);
		Session session=factory.openSession();
		
		DepartmentInfoBean deptInfo=new DepartmentInfoBean();
		deptInfo.setDept_id(20);
		deptInfo.setDept_name("Trainee Software Engineer");
		
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(deptInfo);
			tx.commit();
			
		}catch(Exception e) {
			if(tx==null) {
				tx.rollback();
			}
		}finally {
			session.close();
		}
	}

}
