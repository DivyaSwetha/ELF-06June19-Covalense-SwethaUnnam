package com.covalense.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.covalense.hibernateapp.dto.EmployeeAddressInfoBean;
import com.covalense.hibernateapp.dto.EmployeeEducationalInfo;
import com.covalense.hibernateapp.dto.EmployeeExperienceInfoBean;

import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;
import com.covalense.hibernateapp.dto.TrainingInfoBean;
import com.covalense.hibernateapp.dto.primary.EmployeeInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeAddressPKBean;
import com.covalense.hibernateapp.manytoone.EmployeeEducationalPKBean;
import com.covalense.hibernateapp.manytoone.EmployeeExperiencePKBean;
import com.covalense.hibernateapp.model.HibernateImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException
    {
    	EmployeeInfoBean empInfo=new EmployeeInfoBean();
    	SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		Date dob=format.parse("1997-03-21");
		Date join=format.parse("2019-03-21");

		empInfo.setId(1);
		empInfo.setName("sheroi");
		empInfo.setAge(22);
		empInfo.setPhone(9988006655l);
		empInfo.setSalary(19500);
		empInfo.setEmail("ram@gmail.com");
		empInfo.setAccountNumber(123454589087l);
		//empInfo.setDeptId(11);
	    //empInfo.setMngrId(111);
		empInfo.setGender("female");
		empInfo.setJoiningDate(join);
		empInfo.setDesignation("Software Engineer");
		empInfo.setDob(dob);
		empInfo.setPassword("12345");
		
		EmployeeOtherInfoBean empOther = new EmployeeOtherInfoBean();
		empOther.setAdhar(123409875642l);
		empOther.setBloodGroup("A+ve");
		empOther.setEmergencyContactName("prasad");
		empOther.setEmergencyContactNum(7653826908l);
		empOther.setFatherName("Rayudu");
		empOther.setIschallenged(false);
		empOther.setIsmarried(true);
		empOther.setMotherName("Mani");
		empOther.setNationality("Indian");
		empOther.setPan("AHAU123P");
		empOther.setPassport("P1409999");
		empOther.setReligion("Christian");
		empOther.setSpouseName("senen");
		empOther.setEmpInfo(empInfo);
		empInfo.setEmployeeOtherInfo(empOther);
		
        EmployeeAddressPKBean addressPKBeanTemp=new EmployeeAddressPKBean();
		 addressPKBeanTemp.setAddressType("Temporary");
		 addressPKBeanTemp.setEmpInfo(empInfo);
		 
		 EmployeeAddressPKBean addressPKBeanPerm=new EmployeeAddressPKBean();
		 addressPKBeanPerm.setAddressType("Permanent");
		 addressPKBeanPerm.setEmpInfo(empInfo);
		 
		 EmployeeAddressInfoBean addressInfoTemp = new EmployeeAddressInfoBean();
		 addressInfoTemp.setAddressPKBean(addressPKBeanTemp);
		 addressInfoTemp.setAddress1("29th mainroad,BTM layout");
		 addressInfoTemp.setAddress2("Lake road, near inventateq");
		 addressInfoTemp.setCity("Bangalore");
		 addressInfoTemp.setLandmark("near inventateq");
		 addressInfoTemp.setState("Karnataka"); addressInfoTemp.setPincode(560068);
		 addressInfoTemp.setCountry("India");
		 
		 EmployeeAddressInfoBean addressInfoPerm = new EmployeeAddressInfoBean();
		 addressInfoPerm.setAddressPKBean(addressPKBeanPerm);
		 addressInfoPerm.setAddress1("Ramnagar");
		 addressInfoPerm.setAddress2("Mainroad road");
		 addressInfoPerm.setCity("Kadapa");
		 addressInfoPerm.setLandmark("near watertank");
		 addressInfoPerm.setState("AndhraPradesh");
		 addressInfoPerm.setPincode(516115); 
		 addressInfoPerm.setCountry("India");
		 empInfo.setAddressInfoBeans(Arrays.asList(addressInfoPerm,addressInfoTemp));
		 
		 EmployeeEducationalPKBean empSSC=new EmployeeEducationalPKBean();
		 empSSC.setEducationType("SSC"); 
		 empSSC.setEmpInfo(empInfo);
		 EmployeeEducationalPKBean empPU=new EmployeeEducationalPKBean();
		 empPU.setEducationType("PU");
		 empPU.setEmpInfo(empInfo);
		 EmployeeEducationalPKBean empDegree=new EmployeeEducationalPKBean();
		 empDegree.setEducationType("Degree"); 
		 empDegree.setEmpInfo(empInfo);
		 
		 EmployeeEducationalInfo empSSCInfo=new EmployeeEducationalInfo();
		 empSSCInfo.setBranch("ssc"); 
		 empSSCInfo.setCollege_nm("RHS");
		 empSSCInfo.setDegree_type("High School"); 
		 empSSCInfo.setLocation("A.P");
		 empSSCInfo.setPercentage(89.9); 
		 empSSCInfo.setEmpEducationInfo(empSSC);
		 empSSCInfo.setUniversity("State Board"); 
		 empSSCInfo.setYop("2011");
		 
		 EmployeeEducationalInfo empPUInfo=new EmployeeEducationalInfo();
		 empPUInfo.setBranch("MPC"); 
		 empPUInfo.setCollege_nm("GJC");
		 empPUInfo.setDegree_type("Intermediate");
		 empPUInfo.setLocation("A.P");
		 empPUInfo.setPercentage(97.0); 
		 empPUInfo.setEmpEducationInfo(empPU);
		 empPUInfo.setUniversity("State Board");
		 empPUInfo.setYop("2013");
		 
		 EmployeeEducationalInfo empDegreeInfo=new EmployeeEducationalInfo();
		 empDegreeInfo.setBranch("ECE");
		 empDegreeInfo.setCollege_nm("MKITW");
		 empDegreeInfo.setDegree_type("B.Tech");
		 empDegreeInfo.setLocation("A.P");
		 empDegreeInfo.setPercentage(80.0);
		 empDegreeInfo.setEmpEducationInfo(empDegree);
		 empDegreeInfo.setUniversity("JNTUA"); 
		 empDegreeInfo.setYop("2017");
		 empInfo.setEducationInfoBeans(Arrays.asList(empSSCInfo,empPUInfo,empDegreeInfo));
		 
         EmployeeExperiencePKBean empExpPK1=new EmployeeExperiencePKBean();
		 empExpPK1.setEmpInfo(empInfo); 
		 empExpPK1.setCompanyName("HealthIGI");
		 
		 EmployeeExperiencePKBean empExpPK2=new EmployeeExperiencePKBean();
		 empExpPK2.setEmpInfo(empInfo);
		 empExpPK2.setCompanyName("CGI");
		 
		 EmployeeExperienceInfoBean empExpInfo1=new EmployeeExperienceInfoBean();
		 empExpInfo1.setDesignation("Trainee Software Engineer");
		 empExpInfo1.setEmpPKBean(empExpPK1);
		 Date joinExp=format.parse("2016-03-21");
		 Date leaveExp=format.parse("2018-03-21");
		 empExpInfo1.setJoiningDate(joinExp);
		 empExpInfo1.setLeavingDate(leaveExp);
		 
		 EmployeeExperienceInfoBean empExpInfo2=new EmployeeExperienceInfoBean();
		 empExpInfo2.setDesignation("Assistant Software Engineer");
		 empExpInfo2.setEmpPKBean(empExpPK2); 
		 Date joinExp1=format.parse("2018-03-31");
		 Date leaveExp1=format.parse("2019-03-21");
		 empExpInfo2.setJoiningDate(joinExp1);
		 empExpInfo2.setLeavingDate(leaveExp1);
		 empInfo.setExperienceInfoBeans(Arrays.asList(empExpInfo1,empExpInfo2));
		 
		 TrainingInfoBean trainingInfo1=new TrainingInfoBean();
			trainingInfo1.setCourseType("FULL TIME");
			trainingInfo1.setCourseId(103);
			trainingInfo1.setCourseName("Java");
			trainingInfo1.setDuration("60 days");
			trainingInfo1.setEmpInfoBeans(Arrays.asList(empInfo));
			
	     TrainingInfoBean trainingInfo2=new TrainingInfoBean();
			trainingInfo2.setCourseType("FULL TIME");
			trainingInfo2.setCourseId(102);
			trainingInfo2.setCourseName("J2EE");
			trainingInfo2.setDuration("60 days");
			trainingInfo2.setEmpInfoBeans(Arrays.asList(empInfo));
			
			empInfo.setTrainingInfoBeans(Arrays.asList(trainingInfo1,trainingInfo2));
			
		HibernateImpl impl=new HibernateImpl();
		impl.createEmployee(empInfo);
		
		
		
		
		
		
		/*
		 * EmployeeAddressPKBean addressPKBeanTemp=new EmployeeAddressPKBean();
		 * addressPKBeanTemp.setAddressType("Temporary");
		 * addressPKBeanTemp.setEmpInfo(empInfo);
		 * 
		 * EmployeeAddressPKBean addressPKBeanPerm=new EmployeeAddressPKBean();
		 * addressPKBeanPerm.setAddressType("Permanent");
		 * addressPKBeanPerm.setEmpInfo(empInfo);
		 * 
		 * EmployeeAddressInfoBean addressInfoTemp = new EmployeeAddressInfoBean();
		 * addressInfoTemp.setAddressPKBean(addressPKBeanTemp);
		 * addressInfoTemp.setAddress1("29th mainroad,BTM layout");
		 * addressInfoTemp.setAddress2("Lake road, near inventateq");
		 * addressInfoTemp.setCity("Bangalore");
		 * addressInfoTemp.setLandmark("near inventateq");
		 * addressInfoTemp.setState("Karnataka"); addressInfoTemp.setPincode(560068);
		 * addressInfoTemp.setCountry("India");
		 * 
		 * EmployeeAddressInfoBean addressInfoPerm = new EmployeeAddressInfoBean();
		 * addressInfoPerm.setAddressPKBean(addressPKBeanPerm);
		 * addressInfoPerm.setAddress1("Ramnagar");
		 * addressInfoPerm.setAddress2("Mainroad road");
		 * addressInfoPerm.setCity("Kadapa");
		 * addressInfoPerm.setLandmark("near watertank");
		 * addressInfoPerm.setState("AndhraPradesh");
		 * addressInfoPerm.setPincode(516115); addressInfoPerm.setCountry("India");
		 * 
		 * EmployeeEducationalPKBean empSSC=new EmployeeEducationalPKBean();
		 * empSSC.setEducationType("SSC"); empSSC.setEmpInfo(empInfo);
		 * EmployeeEducationalPKBean empPU=new EmployeeEducationalPKBean();
		 * empPU.setEducationType("PU"); empPU.setEmpInfo(empInfo);
		 * EmployeeEducationalPKBean empDegree=new EmployeeEducationalPKBean();
		 * empDegree.setEducationType("Degree"); empDegree.setEmpInfo(empInfo);
		 * 
		 * EmployeeEducationalInfo empSSCInfo=new EmployeeEducationalInfo();
		 * empSSCInfo.setBranch("ssc"); empSSCInfo.setCollege_nm("RHS");
		 * empSSCInfo.setDegree_type("High School"); empSSCInfo.setLocation("A.P");
		 * empSSCInfo.setPercentage(89.9); empSSCInfo.setEmpEducationInfo(empSSC);
		 * empSSCInfo.setUniversity("State Board"); empSSCInfo.setYop("2011");
		 * 
		 * EmployeeEducationalInfo empPUInfo=new EmployeeEducationalInfo();
		 * empPUInfo.setBranch("MPC"); empPUInfo.setCollege_nm("GJC");
		 * empPUInfo.setDegree_type("Intermediate"); empPUInfo.setLocation("A.P");
		 * empPUInfo.setPercentage(97.0); empPUInfo.setEmpEducationInfo(empPU);
		 * empPUInfo.setUniversity("State Board"); empPUInfo.setYop("2013");
		 * 
		 * EmployeeEducationalInfo empDegreeInfo=new EmployeeEducationalInfo();
		 * empDegreeInfo.setBranch("ECE"); empDegreeInfo.setCollege_nm("MKITW");
		 * empDegreeInfo.setDegree_type("B.Tech"); empDegreeInfo.setLocation("A.P");
		 * empDegreeInfo.setPercentage(80.0);
		 * empDegreeInfo.setEmpEducationInfo(empDegree);
		 * empDegreeInfo.setUniversity("JNTUA"); empDegreeInfo.setYop("2017");
		 * 
		 * EmployeeExperiencePKBean empExpPK1=new EmployeeExperiencePKBean();
		 * empExpPK1.setEmpInfo(empInfo); empExpPK1.setCompanyName("HealthIGI");
		 * 
		 * EmployeeExperiencePKBean empExpPK2=new EmployeeExperiencePKBean();
		 * empExpPK2.setEmpInfo(empInfo); empExpPK2.setCompanyName("CGI");
		 * 
		 * EmployeeExperienceInfoBean empExpInfo1=new EmployeeExperienceInfoBean();
		 * empExpInfo1.setDesignation("Trainee Software Engineer");
		 * empExpInfo1.setEmpPKBean(empExpPK1); Date joinExp=format.parse("2016-03-21");
		 * Date leaveExp=format.parse("2018-03-21");
		 * empExpInfo1.setJoiningDate(joinExp); empExpInfo1.setLeavingDate(leaveExp);
		 * 
		 * EmployeeExperienceInfoBean empExpInfo2=new EmployeeExperienceInfoBean();
		 * empExpInfo2.setDesignation("Assistant Software Engineer");
		 * empExpInfo2.setEmpPKBean(empExpPK2); Date
		 * joinExp1=format.parse("2018-03-31"); Date
		 * leaveExp1=format.parse("2019-03-21"); empExpInfo2.setJoiningDate(joinExp1);
		 * empExpInfo2.setLeavingDate(leaveExp1);
		 * 
		 * HibernateImpl hib=new HibernateImpl(); hib.createEmployee(empInfo ,empOther
		 * ,Arrays.asList(addressInfoPerm,addressInfoTemp)
		 * ,Arrays.asList(empSSCInfo,empPUInfo,empDegreeInfo)
		 * ,Arrays.asList(empExpInfo1,empExpInfo2));
		 */
		
    }//End of main
}//End of App
