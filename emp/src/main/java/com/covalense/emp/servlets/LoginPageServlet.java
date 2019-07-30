package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/loginpage")
public class LoginPageServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	Cookie dummyCookie=new Cookie("dummyCookie","CheckCookiesEnabled");
	resp.addCookie(dummyCookie);
	
	PrintWriter out=resp.getWriter();
	HttpSession session=req.getSession();
	RequestDispatcher dispatcher=null;
	if(session==null) {
		dispatcher=req.getRequestDispatcher("/loginFail?msg=Invalid credentials!!!");
		dispatcher.forward(req,resp);
	}else {
		dispatcher=req.getRequestDispatcher("/loginJsp.jsp");
		dispatcher.forward(req, resp);
	}
		


}
}//End of class
