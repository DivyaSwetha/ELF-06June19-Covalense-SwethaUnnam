package com.covalense.hibernate.hibernateassessment.cache;

import org.hibernate.Session;

import com.covalense.hibernate.hibernateassessment.util.HibernateUtil;

public class StudentCacheTest {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		session.get(StudentInfoBean.class, 1);
		session.get(StudentInfoBean.class, 1);
		session.get(StudentInfoBean.class, 1);
	}

}
