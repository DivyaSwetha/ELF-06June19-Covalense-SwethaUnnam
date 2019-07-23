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
		empOther.setBlood_grp("A+ve");
		empOther.setId(id);
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
		
		empInfo.setOtherInfo(empOther);
		
		return empInfo;

	}//End of prepare data

}//End of class
