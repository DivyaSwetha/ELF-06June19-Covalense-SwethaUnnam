package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createCookie")
public class CreateCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//Create Cookie
		Cookie myNameCookie=new Cookie("myName","Swetha");
		Cookie myLocationCookie=new Cookie("myLocation","Banglore");
		myLocationCookie.setMaxAge(7*24*60*60); //Time in sec
		
		//Send the above cookie to Browser
		resp.addCookie(myNameCookie);
		resp.addCookie(myLocationCookie);
		
		PrintWriter out=resp.getWriter();
		out.print("Created the cookies!!!");
		
		
	}// End of doGet()
}// End of class
