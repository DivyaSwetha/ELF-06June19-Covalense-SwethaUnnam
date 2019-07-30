package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.beans.EmployeeOtherInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@WebServlet("/insert")
public class CreateEmployeeInfoServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String idValue=req.getParameter("id");
		String nameValue= req.getParameter("name");
		String ageValue= req.getParameter("age");
		String genderValue= req.getParameter("gender");
		String salaryValue= req.getParameter("salary");
		String phoneValue =req.getParameter("phone");
		String jdateValue =req.getParameter("joiningDate");
		String accnumValue= req.getParameter("accountNumber");
		String emailValue = req.getParameter("email");
		String designationValue= req.getParameter("designation");
		String dobValue= req.getParameter("dob");
		String deptidValue =req.getParameter("departmentId");
		String mngridValue= req.getParameter("managerId");
		String passwordValue=req.getParameter("password");
		
		EmployeeInfoBean bean=new EmployeeInfoBean();
		

		SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy");
		Date dob;
		Date join;
		try {
			dob = format.parse(dobValue);
			//java.sql.Date newdob = new java.sql.Date(dob.getTime());
			join=format.parse(jdateValue);
			//java.sql.Date newjoin = new java.sql.Date(join.getTime());

			bean.setJoiningDate(join);
			bean.setDob(dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		bean.setId(Integer.parseInt(idValue));
		bean.setName(nameValue);
		bean.setAge(Integer.parseInt(ageValue));
		bean.setPhone(893);
		bean.setSalary(Double.parseDouble(salaryValue));
		bean.setEmail(emailValue);
		bean.setAccountNumber(123);
		bean.setDepartmentId(Integer.parseInt(deptidValue));
		bean.setManagerId(Integer.parseInt(mngridValue));
		bean.setGender(genderValue);
		bean.setDesignation(designationValue);
		bean.setPassword(passwordValue);
		
		//String idValue1=req.getParameter("id");
        String emergencyContact=req.getParameter("emergencyNo");
        String emergencyName=req.getParameter("emergencyName");
        String motherName=req.getParameter("MotherName");
        String spouse=req.getParameter("spousename");
        String maritalstatus=req.getParameter("maritalstatus");
        String nationality=req.getParameter("nationality");
        String passport=req.getParameter("passport");
        String bloodgroup=req.getParameter("bloodgroup");
        String religion=req.getParameter("religion");
        String aadhar=req.getParameter("aadhar");
        String challenged=req.getParameter("challenged");
        String fathername=req.getParameter("fathername");
        String pan=req.getParameter("pan");
        
        
        EmployeeOtherInfoBean empother=new EmployeeOtherInfoBean();
       // empother.setId(Integer.parseInt(idValue));
        empother.setAdhar(Long.parseLong(aadhar));
        empother.setBlood_grp(bloodgroup);
        empother.setEmergency_contact_name(emergencyContact);
        empother.setEmergency_contact_number(Long.parseLong(emergencyContact));
        empother.setFather_nm(fathername);
        empother.setIschallenged(Boolean.parseBoolean(challenged));
        empother.setIsmarried(Boolean.parseBoolean(maritalstatus));
        empother.setMother_nm(motherName);
        empother.setNationality(nationality);
        empother.setPan(pan);
        empother.setPassport(passport);
        empother.setReligion(religion);
        empother.setSpouse_nm(spouse);
        
        bean.setOtherInfo(empother);
		
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		boolean result=dao.createEmployeeInfo(bean);
		
		
	
		RequestDispatcher dispatcher=null;
		if(result==true) {
			dispatcher=req.getRequestDispatcher("loginfail.jsp?msg=Registration successfull, Please login !!!");
			dispatcher.forward(req,resp);
		}else {
			dispatcher=req.getRequestDispatcher("loginfail.jsp?msg=Registration failed, Please try again !!!");
			dispatcher.forward(req,resp);
		}
		
		
		ServletContext ctx=getServletContext();
		ctx.setAttribute("info", bean);
		Object empId=ctx.getAttribute("Eid");
		String url = "search?id="+empId;                                      
		 dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
	}
	
	

}
