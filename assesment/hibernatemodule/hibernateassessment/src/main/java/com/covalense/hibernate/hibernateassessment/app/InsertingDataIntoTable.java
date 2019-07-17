package com.covalense.hibernate.hibernateassessment.app;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.covalense.hibernate.hibernateassessment.util.HibernateUtil;

public class InsertingDataIntoTable {

	public static void main(String[] args) {
		Session session=HibernateUtil.openSession();
		Query query=session.createQuery("insert into TestTableBean (id,firstName,lastName,city) select id,firstName,lastName,city from CustomerBean where id=1");
		session.close();

	}

}
