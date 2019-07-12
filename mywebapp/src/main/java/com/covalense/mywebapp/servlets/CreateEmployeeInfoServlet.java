package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;
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
		String jdateValue =req.getParameter("jdate");
		String accnumValue= req.getParameter("accnum");
		String emailValue = req.getParameter("email");
		String designationValue= req.getParameter("designation");
		String dobValue= req.getParameter("dob");
		String deptidValue =req.getParameter("deptid");
		String mngridValue= req.getParameter("mngrid");
		
		EmployeeInfoBean bean=new EmployeeInfoBean();
		

		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		Date dob;
		Date join;
		try {
			dob = format.parse(dobValue);
			java.sql.Date newdob = new java.sql.Date(dob.getTime());
			join=format.parse(jdateValue);
			java.sql.Date newjoin = new java.sql.Date(join.getTime());

			bean.setJoiningDate(newjoin);
			bean.setDob(newdob);
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
		dao.createEmployeeInfo(bean);
		
		PrintWriter out=resp.getWriter();
		
		out.print("<HTML>");
		out.print("<BODY>");
		out.print("<H1><span style=\"color: blue\">Details of Employee "+nameValue+" has inserted successfully...</H1></span>");
		out.print("</BODY>");
		out.print("</HTML>");
	
	}
	
	

}
