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
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//Invalidate Session
	HttpSession session=req.getSession(false);
	if(session==null) {
		session.invalidate();
	}
	RequestDispatcher dispatcher=null;
	PrintWriter out=resp.getWriter();
	out.print("<H1><center><span style=\"color: blue\">Thanks for visiting...</H1></span></center>");
	dispatcher = req.getRequestDispatcher("index.html");
	dispatcher.include(req, resp);


}//End of doGet
	
}//End of class
