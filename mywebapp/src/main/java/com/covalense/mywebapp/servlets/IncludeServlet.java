package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/include")
public class IncludeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	RequestDispatcher dispatcher=null;
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	
	out.println("1");
	out.println("<BR>");
	dispatcher=req.getRequestDispatcher("index.html");
	dispatcher.include(req, resp);
	out.println("<BR>");
	out.println("2");
	out.println("<BR>");
	dispatcher=req.getRequestDispatcher("currentDate?fname=Swetha&lname=U");
	dispatcher.include(req, resp);
	out.println("3");
	out.println("<BR>");
	dispatcher=req.getRequestDispatcher("search?id=1");
	dispatcher.include(req, resp);
	out.println("<BR>");
	out.println("4");
	out.println("<BR>");
	out.println("5");
	}//End of doGet()

}//End of class
