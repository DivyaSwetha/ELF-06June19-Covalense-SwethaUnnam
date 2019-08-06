package com.covalense.hibernateapp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;
import com.covalense.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class PrepareDataUtil {
	
	private PrepareDataUtil() {
		
	}
	
	public static EmployeeInfoBean prepareData(int id) throws ParseException {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		Date dob=format.parse("1997-03-21");
		Date join=format.parse("2019-03-21");

		EmployeeInfoBean empInfo = new EmployeeInfoBean();
		empInfo.setId(id);
		empInfo.setName("usha");
		empInfo.setAge(22);
		empInfo.setPhone(9988006655l);
		empInfo.setSalary(19500);
		empInfo.setEmail("usha@gmail.com");
		empInfo.setAccountNumber(123454589087l);
		empInfo.setDeptId(11);
		empInfo.setMngrId(111);
		empInfo.setGender("female");
		empInfo.setJoiningDate(join);
		empInfo.setDesignation("Software Engineer");
		empInfo.setDob(dob);
		
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
		
		//empInfo.setOtherInfo(empOther);
		
		return empInfo;

	}//End of prepare data

}//End of class
