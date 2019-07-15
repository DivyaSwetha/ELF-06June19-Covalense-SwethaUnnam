package com.covalense.mywebapp.servlets;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;

@WebServlet(urlPatterns="/search",
			initParams= {
							@WebInitParam(name="actress",value="basanthi")
						}
			)
//@WebServlet("/search")
public class EmployeeSearchServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext ctx=getServletContext();
		String movieName=ctx.getInitParameter("movie");
		
		ServletConfig config=getServletConfig();
		String actorName=config.getInitParameter("actor");
		String actressName=config.getInitParameter("actress");
		
		String idValue=req.getParameter("id");
		//Interact with DB
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean=dao.getEmployeeInfo(idValue);
		
		//send the response to the browser
		PrintWriter out=resp.getWriter();
		
		if(bean==null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color: blue\">Employee not found!!!</H1></span>");
			out.print("</BODY>");
			out.print("</HTML>");
		}else {
				out.print("<HTML>");
				out.print("<BODY>");
				out.print("<H1><span style=\"color: blue\">Employee found...</H1></span>");
				out.print("<BR>");
				out.print("<BR> Id of employee is: " + bean.getId());
				out.print("<BR> Name of employee is: " + bean.getName());
				out.print("<BR> Gender is: " + bean.getGender());
				out.print("<BR> Age is: " + bean.getAge());
				out.print("<BR> Salary is: " + bean.getSalary());
				out.print("<BR> Phone no. is: " + bean.getPhone());
				out.print("<BR> Email id is: " + bean.getEmail());
				out.print("<BR> joining date is: " + bean.getJoiningDate());
				out.print("<BR> accountNumber is: " + bean.getAccountNumber());
				out.print("<BR> Designation is: " + bean.getDesignation());
				out.print("<BR> DOB is: " + bean.getDob());
				out.print("<BR> Department id is: " + bean.getDepartmentId());
				out.print("<BR> Manager id is: " + bean.getManagerId());
				out.print("<BR>Movieis: " + movieName);
				out.print("<BR>Actor: " + actorName);
				out.print("<BR>Actress: " + actressName);
				out.print("</BODY>");
				out.print("</HTML>");
			}
		}
		
	}


