package com.covalense.hibernateapp.onetoone;

import java.text.ParseException;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernateapp.util.HibernateUtil;
import com.covalense.hibernateapp.util.PrepareDataUtil;

import lombok.extern.java.Log;

@Log
public class HibernateOneToOneTest {

	public static void main(String[] args) throws ParseException {
		
		//Prepare Data
		int id=19;
		EmployeeInfoBean data=PrepareDataUtil.prepareData(id);
		//Save
		save(data);
		
	}//End of main
public static void save(EmployeeInfoBean data) {
	Transaction txn=null;
	try(Session session=HibernateUtil.getSession()){
		 txn=session.beginTransaction();
		session.save(data);
		txn.commit();
	}catch(Exception ex) {
		log.severe(Arrays.toString(ex.getStackTrace()));
		if(txn!=null) {
		   txn.rollback();
		}
	}//End of Try-catch
}
}//End of class
