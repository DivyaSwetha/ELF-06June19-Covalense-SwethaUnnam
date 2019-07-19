package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
                     
public  class MyFirstServlet extends HttpServlet{
	
       public	MyFirstServlet(){
		
		System.out.println("Inside the constructor");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		ServletContext ctx=getServletContext();
		String movieName=ctx.getInitParameter("movie");
		
		ServletConfig config=getServletConfig();
		String actorName=config.getInitParameter("actor");
		
		String httpMethod=req.getMethod();
		String protocol=req.getProtocol();
		String requestUrl=req.getRequestURL().toString();
		
		System.out.println("Http Method: "+httpMethod);
		System.out.println(" Protocol: "+protocol);
		System.out.println("Request URL: "+requestUrl);

		String currentDateTime=new Date().toString();
		String fnameValue=req.getParameter("fname");
		String lnameValue=req.getParameter("lname");


		String htmlResponse = "<!DOCTYPE html>"+
									"<html>"+
									"<head>"+
									"<meta charset=\"ISO-8859-1\">"+
									"<title>My First HTML</title>"+ 
									"</head>"+
									"<body>"+
									"	<h1>"+
									"		Current Date & Time : <br>"+
									"		 <span style=\"color: blue\">"+currentDateTime+"</span>"+
									"		<br><br>"+
									"         First Name : "+fnameValue+
									"		<br> "+

									"         Last Name : "+lnameValue+"<br>"+
									"         Movie Name : "+movieName+"<br>"+
									"         Actor Name : "+actorName+"<br>"+
									"	</h1>"+
									"</body>"+
									"</html>";
		
		//send the Above HTML Response to Browser
		resp.setContentType("text/html");
		//resp.setHeader("Refresh", "1"); 		//Auto refresh for every second
		PrintWriter out=resp.getWriter();
		out.print(htmlResponse);
		
		//Get the object from forward servlet
				EmployeeInfoBean empInfo=(EmployeeInfoBean) ctx.getAttribute("info");
				if(empInfo==null) {
					out.print("<HTML>");
					out.print("<BODY>");
					out.print("<H1><span style=\"color: blue\">EmployeeInfoBean object not found!!!</H1></span>");
					out.print("</BODY>");
					out.print("</HTML>");
				}else {

					out.print("<HTML>");
					out.print("<BODY>");
					out.print("<H1><span style=\"color: blue\">EmployeeInfoBean object found...</H1></span>");
					out.print("<BR>");
					out.print("<BR> Id of employee is: " + empInfo.getId());
					out.print("<BR> Name of employee is: " + empInfo.getName());
					out.print("<BR> Phone no. is: " + empInfo.getPhone());
					out.print("<BR> Email id is: " + empInfo.getEmail());
					out.print("</BODY>");
					out.print("</HTML>");
				}
		
	}//End of doGet
	
}//End of Class
