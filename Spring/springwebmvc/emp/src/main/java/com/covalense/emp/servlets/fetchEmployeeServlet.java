package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.util.HibernateUtil;
@WebServlet("/fetch")
public class fetchEmployeeServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int eid=Integer.parseInt(req.getParameter("id"));
	Session session=HibernateUtil.openSession();
	EmployeeInfoBean emp=session.get(EmployeeInfoBean.class,eid);
	RequestDispatcher dispatcher=req.getRequestDispatcher("./search?"+emp.getId()+"="+eid);
	dispatcher.include(req, resp);
	PrintWriter out=resp.getWriter();
	out.print("<HTML>");
	out.print("<BODY>");
	out.print("<H1><span style=\"color: blue\">Employee details are...</H1></span>");
	out.print("<BR>");
	out.print("<BR> Id of employee is: " + emp.getId());
	out.print("<BR> Name of employee is: " + emp.getName());
	out.print("<BR> Phone no. is: " + emp.getPhone());
	out.print("<BR> Email id is: " + emp.getEmail());
	out.print("</BODY>");
	out.print("</HTML>");
}
}
