package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;
@WebServlet("/profile")
public class ProfilePicServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session=req.getSession(false);
	EmployeeInfoBean emp=(EmployeeInfoBean) session.getAttribute("data");
	int eid=(int) session.getAttribute("eid");
	RequestDispatcher dispatcher=null;
	PrintWriter out=resp.getWriter();
	EmployeeDAO dao = EmployeeDAOFactory.getInstance();
	EmployeeInfoBean bean = dao.getEmployeeInfo(eid);
	dispatcher=req.getRequestDispatcher("search.html");
	dispatcher.include(req, resp);
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
