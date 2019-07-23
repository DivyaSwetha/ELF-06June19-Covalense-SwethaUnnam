package com.covalense.springhibernate.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springhibernate.beans.EmployeeOtherInfoBean;
import com.covalense.springhibernate.configuration.HibernateConfig;

public class SaveEmployeeOtherInfo {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory=context.getBean(SessionFactory.class);
		Session session=factory.openSession();
		
		EmployeeOtherInfoBean empOther = new EmployeeOtherInfoBean();
		
		empOther.setAdhar(123409875642l);
		empOther.setBlood_grp("A+ve");
		empOther.setId(12);
		empOther.setEmergency_contact_name("Ram");
		empOther.setEmergency_contact_number(7653826908l);
		empOther.setFather_nm("Rayudu");
		empOther.setIschallenged(false);
		empOther.setIsmarried(false);
		empOther.setMother_nm("Mani");
		empOther.setNationality("Indian");
		empOther.setPan("AHAU123P");
		empOther.setPassport("P1409999");
		empOther.setReligion("Christian");
		empOther.setSpouse_nm("No");
		
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(empOther);
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
