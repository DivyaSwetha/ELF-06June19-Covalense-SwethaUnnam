package com.covalense.controller;

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

import com.covalense.dao.EmployeeDAO;
import com.covalense.dao.EmployeeDAOFactory;
import com.covalense.dto.EmployeeInfoBean;


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
		bean.setPhone(Long.parseLong(phoneValue));
		bean.setSalary(Double.parseDouble(salaryValue));
		bean.setEmail(emailValue);
		bean.setAccountNumber(Long.parseLong(accnumValue));
		bean.setDepartmentId(Integer.parseInt(deptidValue));
		bean.setManagerId(Integer.parseInt(mngridValue));
		bean.setGender(genderValue);
		bean.setDesignation(designationValue);
		
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		boolean result=dao.createEmployeeInfo(bean);
		
		PrintWriter out=resp.getWriter();
		
	
		RequestDispatcher dispatcher=null;
		if(result==true) {
			
			dispatcher=req.getRequestDispatcher("/registerfail.jsp?msg=Registered Succesfully!!!");
			dispatcher.forward(req,resp);
		}else {
			//out.println("<span style=\"color: red\">Account creation failed, please try again</span>");
			dispatcher=req.getRequestDispatcher("/registerfail.jsp?msg=Registration failed, Try again!!!");
			dispatcher.include(req,resp);
		}
	
	}
	
	

}
