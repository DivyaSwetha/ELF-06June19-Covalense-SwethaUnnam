package com.covalense.hibernate.hibernateassessment.app;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

import com.covalense.hibernate.hibernateassessment.dto.StudentBean;
import com.covalense.hibernate.hibernateassessment.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class StoredProcedureStudents {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		StoredProcedureQuery query=session.createStoredProcedureCall("getrecords",StudentBean.class);
		List<StudentBean> lists=query.getResultList();
		for (Object beans : lists) {
			log.info("Details: " + beans.toString());
		}
	}

}
