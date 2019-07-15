package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/readCookie")
public class ReadCookieServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//Get the cookie from the request
	Cookie[] recievedCookies=req.getCookies();
	
	PrintWriter out=resp.getWriter();
	
	if(recievedCookies==null) {
		out.print("Cookies are not present !!!");
	}else {
		
		out.print("Cookies are present...");
		
		for (Cookie rcvdCookie : recievedCookies) {
			out.print("Cookie Name: "+rcvdCookie.getName());
			out.print("Cookie Value: "+rcvdCookie.getValue());
		}//ENd of for
	}//End of if-else
}//End of doGet()
}//End of Servlet
