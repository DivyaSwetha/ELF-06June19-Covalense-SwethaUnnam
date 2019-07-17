package com.covalense.hibernate.hibernateassessment.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.covalense.hibernate.hibernateassessment.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class StudentAggregateFunctions {

	public static void main(String[] args) {

		Session session=HibernateUtil.openSession();
		Query<Double> query=session.createQuery("select min(totalMarks) from StudentBean");
		List<Double> lists=query.list();
		for(Double beans:lists) {
			log.info("Minimum marks students: "+beans.toString());
		}
		Query<Double> queryAvg=session.createQuery("select avg(totalMarks) from StudentBean");
		List<Double> listA=queryAvg.list();
		for(Double beans:listA) {
			log.info("Average marks students: "+beans.toString());
		}
		Query<Double> queryMax=session.createQuery("select max(totalMarks) from StudentBean");
		List<Double> listM=query.list();
		for(Double beans:listM) {
			log.info("Maximum marks students: "+beans.toString());
		}
		
		
	}

}
