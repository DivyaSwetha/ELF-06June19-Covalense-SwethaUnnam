package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;

public class SaveEmployeeOtherInfo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeOtherInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeOtherInfoBean empOther = new EmployeeOtherInfoBean();
		empOther.setAdhar(123409875642l);
		empOther.setBloodGroup("A+ve");
		//empOther.setId(11);
		empOther.setEmergencyContactName("Ram");
		empOther.setEmergencyContactNum(7653826908l);
		empOther.setFatherName("Rayudu");
		empOther.setIschallenged(false);
		empOther.setIsmarried(false);
		empOther.setMotherName("Mani");
		empOther.setNationality("Indian");
		empOther.setPan("AHAU123P");
		empOther.setPassport("P1409999");
		empOther.setReligion("Christian");
		empOther.setSpouseName("No");

		Transaction transaction = session.beginTransaction();
		session.save(empOther);
		transaction.commit();
		session.close();
	}

}
