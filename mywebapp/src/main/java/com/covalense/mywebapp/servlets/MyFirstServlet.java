package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
                     
public class MyFirstServlet extends HttpServlet{
       public	MyFirstServlet(){
		
		System.out.println("Inside the constructor");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
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

									"         Last Name : "+lnameValue+
									"	</h1>"+
									"</body>"+
									"</html>";
		
		//send the Above HTML Response to Browser
		resp.setContentType("text/html");
		//resp.setHeader("Refresh", "1"); 		//Auto refresh for every second
		PrintWriter out=resp.getWriter();
		out.print(htmlResponse);
		
	}//End of doGet
	
}//End of Class
