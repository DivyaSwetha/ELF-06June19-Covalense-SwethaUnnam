package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.util.HibernateUtil;

@WebServlet("/empinfo")
public class DisplayEmpInfoServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Session session=HibernateUtil.openSession();
		ServletContext ctx=getServletContext();
		PrintWriter out=resp.getWriter();
	
		Object emp=ctx.getAttribute("Eid");
		int eid=(Integer) emp;
		EmployeeInfoBean empInfo=session.get(EmployeeInfoBean.class,eid);
		RequestDispatcher dispatcher=null;
		
		if(empInfo==null) {
			dispatcher=req.getRequestDispatcher("search.html"); 
			dispatcher.include(req, resp);
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color: blue\">EmployeeInfoBean object not found!!!</H1></span>");
			out.print("</BODY>");
			out.print("</HTML>");
		}else {
			dispatcher=req.getRequestDispatcher("search.html");
			dispatcher.include(req, resp);
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color: blue\">Employee details are...</H1></span>");
			out.print("<BR>");
			out.print("<BR> Id of employee is: " + empInfo.getId());
			out.print("<BR> Name of employee is: " + empInfo.getName());
			out.print("<BR> Phone no. is: " + empInfo.getPhone());
			out.print("<BR> Email id is: " + empInfo.getEmail());
			out.print("</BODY>");
			out.print("</HTML>");
			//resp.forward("info.html");
			
		}

	}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

doPost(req, resp);
}
}
