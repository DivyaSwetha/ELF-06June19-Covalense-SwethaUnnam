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
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import com.covalense.empnew.beans.EmployeeInfoBean;
import com.covalense.empnew.util.HibernateUtil;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		//check cookies are disabled
		if(req.getCookies()==null) {
			req.getRequestDispatcher("CookiesDisabled.html").include(req, resp);
			return;
		}
		
		int empId=Integer.parseInt(req.getParameter("id"));
		String empPass=req.getParameter("password");
		Session session=HibernateUtil.openSession();
		ServletContext ctx=getServletContext();
		EmployeeInfoBean emp=session.get(EmployeeInfoBean.class,empId);
		PrintWriter out=resp.getWriter();
		RequestDispatcher dispatcher=null;
		if((emp==null)&&(emp.getPassword().equals(empPass))) {
			//valid credentials; create a session
			HttpSession httpSession=req.getSession(true);
			
			resp.sendRedirect("search.jsp");
			httpSession.setAttribute("data", emp);
			httpSession.setAttribute("eid",empId);
			
		}else {
			String url="/loginFail?msg=Invalid Credentials!!! please try again";
			dispatcher=req.getRequestDispatcher(url);
			dispatcher.forward(req,resp);
		
		}
		
		ctx.setAttribute("Eid", empId);
		
		
	}

}
