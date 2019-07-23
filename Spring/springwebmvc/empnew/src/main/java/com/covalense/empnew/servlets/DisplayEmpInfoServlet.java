package com.covalense.empnew.servlets;

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

import com.covalense.empnew.beans.EmployeeInfoBean;
import com.covalense.empnew.util.HibernateUtil;


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
			dispatcher=req.getRequestDispatcher("searchnotfound.jsp?notfound=EmployeeInfoBean object not found!!!"); 
			dispatcher.forward(req, resp);
			
		}else {
			dispatcher=req.getRequestDispatcher("searchfound.jsp");
			dispatcher.forward(req, resp);
		
		}

	}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

doPost(req, resp);
}
}
