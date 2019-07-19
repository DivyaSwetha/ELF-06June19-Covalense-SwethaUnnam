package com.covalense.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String url = "www.gmail.com";    //can't forward to external resources
		
		EmployeeInfoBean empInfo=new EmployeeInfoBean();
		empInfo.setId(1234);
		empInfo.setName("Ram");
		empInfo.setEmail("Ram@gmail.com");
		empInfo.setPhone(987654321l);
		
		//Pass the above object to employeesearchservlet
		//req.setAttribute("info", empInfo);
		ServletContext ctx=getServletContext();
		ctx.setAttribute("info", empInfo);
		String url = "search?id=1";                                      
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);

	}// End of doGet()

}// End of class
