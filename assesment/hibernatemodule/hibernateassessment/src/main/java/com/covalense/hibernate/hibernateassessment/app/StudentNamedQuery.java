package com.covalense.hibernate.hibernateassessment.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.covalense.hibernate.hibernateassessment.dto.StudentBean;
import com.covalense.hibernate.hibernateassessment.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class StudentNamedQuery {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		Query query = session.createQuery("from StudentBean where rollNum=:r and subject=:s");
		query.setParameter("r", 1);
		query.setParameter("s", "eng");
		List<StudentBean> lists = query.list();

		for (Object beans : lists) {
			log.info("Details: " + beans.toString());
		}
	}

}
